package com.sun0range.anyone_blog.webviewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView)findViewById(R.id.webView1);
        webView.clearCache(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.google.co.jp/", null);
    }
}
