package com.skubag.waec.activity.settings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.skubag.waec.R;
import com.skubag.waec.utils.Tools;

public class SettingProfileLight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_profile_light);
        Tools.setSystemBarColor(this, android.R.color.white);
        Tools.setSystemBarLight(this);
    }
}
