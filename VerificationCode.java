package com.skubag.waec.activity.verification;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.github.kittinunf.fuel.Fuel;
import com.github.kittinunf.fuel.core.FuelError;
import com.github.kittinunf.fuel.core.Handler;
import com.github.kittinunf.fuel.core.Request;
import com.github.kittinunf.fuel.core.Response;
import com.skubag.waec.R;
import com.skubag.waec.activity.dashboard.DashboardGridFab;
import com.skubag.waec.activity.profile.ProfilePurple;
import com.skubag.waec.activity.user.User;
import com.skubag.waec.data.SharedPrefManager;
import com.skubag.waec.helper.RequestHandler;
import com.skubag.waec.helper.URLs;
import com.skubag.waec.utils.Tools;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;

public class VerificationCode extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    Context context;
    public String status;
    EditText v1,v2,v3,v4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_code);
        context = getApplicationContext();


        //Button buttonclick = findViewById(R.id.verify_code);
        v1 = findViewById(R.id.v1);
        v2 = findViewById(R.id.v2);
        v3 = findViewById(R.id.v3);
        v4 = findViewById(R.id.v4);
        findViewById(R.id.btn_verify_code).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if user pressed on button register
                //here we will register the user to server
                //activateUser();
                Fuel.post(URLs.URL_ACTIVATE).responseString(new Handler<String>() {
                    @Override
                    public void success(Request request, Response response, String s) {
                        try {
                            //progressDialog.dismiss();
                            JSONObject obj = new JSONObject(s);
                            Toast.makeText(getApplicationContext(), obj.getString("message"), Toast.LENGTH_LONG).show();
                        } catch (Exception e) {
                        }
                    }

                    @Override
                    public void failure(Request request, Response response, FuelError fuelError) {

                        //progressDialog.dismiss();
                    }
                });
            }
        });

        codeEditTextFull(v1,v2);
        codeEditTextFull(v2,v3);
        codeEditTextFull(v3,v4);
        codeEditTextFull(v4,v1);

//        progressDialog.setMessage("Connecting to server....");
//        progressDialog.show();


    }

    public void codeEditTextFull(EditText edtFrom, final EditText edtTo){
        edtFrom.addTextChangedListener(new TextWatcher()
        {
            public void afterTextChanged(Editable s)
            {
            }
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                edtTo.requestFocus();
            }
        });
    }

    private void activateUser() {


        final String verify_code = v1.getText().toString() + v2.getText().toString() + v3.getText().toString() + v4.getText().toString();


        class ActivateUser extends AsyncTask<Void, Void, String> {

            private ProgressBar progressBar;

            @Override
            protected String doInBackground(Void... voids) {
                //creating request handler object
                RequestHandler requestHandler = new RequestHandler();

                //creating request parameters0
                HashMap<String, String> params = new HashMap<>();
                params.put("verify_code", verify_code);
                params.put("status", status);

                //returning the response
                return requestHandler.sendPostRequest(URLs.URL_ACTIVATE, params);
            }

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                //displaying the progress bar while user registers on the server
                //progressBar = (ProgressBar) findViewById(R.id.progressBar);
                //progressBar.setVisibility(View.VISIBLE);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                //hiding the progressbar after completion
                progressBar.setVisibility(View.GONE);

                try {


                    //converting response to json object
//                    JSONObject obj = new JSONObject(s);
//
//                    //if no error in response
//                    if (!obj.getBoolean("error")) {
//                        Toast.makeText(getApplicationContext(), obj.getString("message"), Toast.LENGTH_LONG).show();
//
//                        //getting the user from the response
//                        JSONObject userJson = obj.getJSONObject("user");
//
//                        //creating a new user object
//                        User user = new User(
//                                userJson.getString("verify_code"),
//                                userJson.getString("status")
//                        );
//
//                        //storing the user in shared preferences
//                        //SharedPrefManager.getInstance(getApplicationContext()).userLogin(user);
//
//                        //starting the profile activity
//                        //finish();
//                        ///startActivity(new Intent(getApplicationContext(), ProfilePurple.class));
//                    } else {
//                        Toast.makeText(getApplicationContext(), obj.getString("message"), Toast.LENGTH_LONG).show();
//                    }
                    JSONObject obj = new JSONObject(s);

                    Toast.makeText(getApplicationContext(), obj.getString("message"), Toast.LENGTH_LONG).show();



                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        //executing the async task
        ActivateUser ru = new ActivateUser();
        ru.execute();
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Tools.setSystemBarColor(this, android.R.color.white);
        Tools.setSystemBarLight(this);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        } else {
            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
