package com.example.ganga;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.ganga.Main2Activity;
import com.example.ganga.R;

public class ProfileFragment extends Fragment {
    private static int SPLASH_TIME_OUT=2000;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_profile,container,false);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        },SPLASH_TIME_OUT);
        return view;
    }
}
