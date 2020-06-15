package com.example.ganga;

import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class GalleryFragment1 extends AppCompatActivity {

    private GridView gridView;
    private GridViewAdapter gridAdapter;
    private ArrayList<Upload> mUploads;
    private DatabaseReference mDatabaseref;
    private ProgressBar mProgressCircle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_fragment1);

        gridView = (GridView) findViewById(R.id.gridView);
        mProgressCircle=findViewById(R.id.progress_circular);


        mUploads = new ArrayList<>();

        mDatabaseref = FirebaseDatabase.getInstance().getReference("uploads");

        mDatabaseref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot postSnapshot : dataSnapshot.getChildren()){
                    Upload upload = postSnapshot.getValue(Upload.class);
                    mUploads.add(upload);
                    mUploads.clear();
                    for (DataSnapshot journalDS : dataSnapshot.getChildren()) {
                        Upload journal = journalDS.getValue(Upload.class);
                        mUploads.add(journal);
                    }
                    gridAdapter = new GridViewAdapter(GalleryFragment1.this, mUploads);
                    gridView.setAdapter(gridAdapter);
                    mProgressCircle.setVisibility(View.INVISIBLE);
                }




            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Toast.makeText(GalleryFragment1.this,databaseError.getMessage(),Toast.LENGTH_LONG).show();
            }

        });
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String imageurl = String.valueOf(mUploads.get(position).getImageUrl());
                Intent zoom = new Intent(GalleryFragment1.this , ZoomActivity.class);
                zoom.putExtra("URL",imageurl);
                startActivity(zoom);

            }
        });

    }


}
