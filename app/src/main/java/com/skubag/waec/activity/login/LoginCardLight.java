package com.skubag.waec.activity.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.skubag.waec.R;
import com.skubag.waec.utils.Tools;

public class LoginCardLight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_card_light);

        Tools.setSystemBarColor(this, R.color.grey_5);
        Tools.setSystemBarLight(this);


    }
}
