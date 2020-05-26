package com.example.ganga;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DonateFragment extends Fragment {

    private View mContentView;
    static WebView mWeb;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mContentView = inflater.inflate(R.layout.fragment_donate, null);

        final WebView mWeb=mContentView.findViewById(R.id.webview2);
        mWeb.setWebViewClient(new WebViewClient());
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
        return mContentView;
    }


    private void webViewGoBack(){
        mWeb.goBack();
    }
}
