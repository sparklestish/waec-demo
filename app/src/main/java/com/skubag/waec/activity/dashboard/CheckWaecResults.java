package com.skubag.waec.activity.dashboard;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;

import com.skubag.waec.R;
import com.skubag.waec.utils.Tools;


public class CheckWaecResults extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_waec_results);

        WebView myWebView = findViewById(R.id.webview_waec_results);
        myWebView.loadUrl("https://ghana.waecdirect.org/");


        initToolbar();
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Tools.setSystemBarColor(this, R.color.colorPrimary);
    }



}
