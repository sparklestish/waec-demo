package com.skubag.waec.activity.verification;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.skubag.waec.R;
import com.skubag.waec.activity.dashboard.DashboardGridFab;
import com.skubag.waec.activity.login.LoginCardLight;
import com.skubag.waec.activity.user.User;
import com.skubag.waec.data.SharedPrefManager;
import com.skubag.waec.helper.RequestHandler;
import com.skubag.waec.helper.URLs;
import com.skubag.waec.utils.Tools;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.regex.Pattern;

public class VerificationPhone extends AppCompatActivity {

    EditText editPhoneNumber;
    public String status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_phone);
        Tools.setSystemBarColor(this, R.color.grey_20);


     //   if the user is already logged in we will directly start the profile activity
        if (SharedPrefManager.getInstance(this).isLoggedIn()) {
            finish();
            startActivity(new Intent(this, DashboardGridFab.class));
            return;
        }

        editPhoneNumber = findViewById(R.id.editPhoneNumber);
        status = "";

        findViewById(R.id.continue_verification).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if user pressed on button register
                //here we will register the user to server
                registerUser();
            }
        });

        findViewById(R.id.no_another_time).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if user pressed on login
                //we will open the login screen
                finish();
                startActivity(new Intent(VerificationPhone.this, LoginCardLight.class));
            }
        });

    }

    private void registerUser() {
        final String phonenumber = editPhoneNumber.getText().toString().trim();

        //first we will do the validations

        if (TextUtils.isEmpty(phonenumber)) {
            editPhoneNumber.setError("Please enter a valid phone number");
            editPhoneNumber.requestFocus();
            return;
        }


            boolean check = false;
            if(!Pattern.matches("[a-zA-Z]+", phonenumber)) {
                //if(phonenumber.length() < 6 || phonenumber.length() > 13) {
                    if(phonenumber.length() != 9) {
                    check = false;
                        editPhoneNumber.setError("Not a Valid Number");
                        editPhoneNumber.requestFocus();
                        return;
                } else {
                    check = true;
                }
            } else {
                check=false;
                return;
            }



        //if it passes all the validations

        class RegisterUser extends AsyncTask<Void, Void, String> {

            private ProgressBar progressBar;

            @Override
            protected String doInBackground(Void... voids) {
                //creating request handler object
                RequestHandler requestHandler = new RequestHandler();

                //creating request parameters
                HashMap<String, String> params = new HashMap<>();
                params.put("phonenumber", phonenumber);
                params.put("status", status);

                //returning the response
                return requestHandler.sendPostRequest(URLs.URL_REGISTER, params);
            }

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                //displaying the progress bar while user registers on the server
                progressBar = (ProgressBar) findViewById(R.id.progressBar);
                progressBar.setVisibility(View.VISIBLE);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                //hiding the progressbar after completion
                progressBar.setVisibility(View.GONE);

                try {
                    //converting response to json object
                    JSONObject obj = new JSONObject(s);

                    //if no error in response
                    if (!obj.getBoolean("error")) {
                        Toast.makeText(getApplicationContext(), obj.getString("message"), Toast.LENGTH_LONG).show();

                        //getting the user from the response
                        JSONObject userJson = obj.getJSONObject("user");

                        //creating a new user object
                        User user = new User(
                                userJson.getString("phonenumber"),
                                userJson.getString("status")
                        );

                        //storing the user in shared preferences
                        //SharedPrefManager.getInstance(getApplicationContext()).userLogin(user);

                        //starting the profile activity
                        //finish();
                        startActivity(new Intent(getApplicationContext(), VerificationCode.class));
                    } else {
                        Toast.makeText(getApplicationContext(), obj.getString("message"), Toast.LENGTH_LONG).show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        //executing the async task
        RegisterUser ru = new RegisterUser();
        ru.execute();
    }

}
