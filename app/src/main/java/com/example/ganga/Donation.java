package com.example.ganga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Donation extends AppCompatActivity {

    static WebView mWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_donate);

        final WebView mWeb=findViewById(R.id.webview2);
        mWeb.setWebViewClient(new WebViewClient());
        mWeb.getSettings().setUserAgentString("Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36");
        mWeb.loadUrl("https://nmcg.nic.in/donation_form.aspx");
        mWeb.setOnKeyListener(new View.OnKeyListener(){

            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (mWeb.canGoBack()) {
                    webViewGoBack();
                    return true;
                }

                return false;
            }

        });
    }
    private void webViewGoBack(){
        mWeb.goBack();
    }
}
