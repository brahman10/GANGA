package com.example.ganga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ZoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom);

        ImageView ZoomImage = findViewById(R.id.zoomimage);
        Bundle bun = getIntent().getExtras();
        String imageurl= bun.getString("URL");
        Glide.with(this).load(imageurl).into(ZoomImage);
    }

}
