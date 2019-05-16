package com.skubag.waec.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.content.Intent;
import android.view.View;
import com.skubag.waec.R;
import android.widget.Button;

import com.skubag.waec.activity.dashboard.DashboardGridFab;
import com.skubag.waec.activity.login.LoginCardLight;
import com.skubag.waec.activity.verification.VerificationPhone;
import com.skubag.waec.adapter.MainMenuAdapter;
import com.skubag.waec.data.SharedPref;
import com.skubag.waec.data.SharedPrefManager;

public class MainMenu extends AppCompatActivity {

    private RecyclerView recycler;
    private MainMenuAdapter adapter;
    private SharedPref sharedPref;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//   if the user is already logged in we will directly start the profile activity
//        if (SharedPrefManager.getInstance(this).isLoggedIn()) {
//            //finish();
//            //startActivity(new Intent(this, DashboardGridFab.class));
//            return;
//        }


//        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
//        if(sharedPreferences.contains("app_verified")){
//            if(sharedPreferences.getBoolean("app_verified",false)){
//                Intent dashboard_intent= new Intent(MainMenu.this, LoginCardLight.class);
//                startActivity(dashboard_intent);
//            }
//        }

        //if the user is already logged in we will directly start the Dashboard activity
//        if (SharedPrefManager.getInstance(this).isLoggedIn()) {
//            finish();
//            startActivity(new Intent(MainMenu.this, DashboardGridFab.class));
//            return;
//        }

        Button buttonclick = findViewById(R.id.get_started);
        buttonclick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // use Intent
                Intent intent1= new Intent(MainMenu.this, VerificationPhone.class);
                startActivity(intent1);
            }
        });
    }







}
