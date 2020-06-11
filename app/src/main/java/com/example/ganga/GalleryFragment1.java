package com.example.ganga;

import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
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
import java.util.List;

public class GalleryFragment1 extends AppCompatActivity {
    /*private RecyclerView mRecyclerView;
    private ImageAdapter mAdapter;

    private DatabaseReference mDatabaseref;
    private ProgressBar mProgressCircle;
    private List<Upload> mUploads;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_fragment1);

        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mProgressCircle=findViewById(R.id.progress_circular);

        mUploads = new ArrayList<>();

        mDatabaseref = FirebaseDatabase.getInstance().getReference("uploads");

        mDatabaseref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot postSnapshot : dataSnapshot.getChildren()){
                    Upload upload = postSnapshot.getValue(Upload.class);
                    mUploads.add(upload);
                }
                mAdapter = new ImageAdapter(getApplicationContext(),mUploads);
                mRecyclerView.setAdapter(mAdapter);
                mProgressCircle.setVisibility(View.INVISIBLE);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Toast.makeText(GalleryFragment1.this,databaseError.getMessage(),Toast.LENGTH_LONG).show();
            }
        });

    }*/
    private GridView gridView;
    private GridViewAdapter gridAdapter;
    private ArrayList<Upload> mUploads;
    private DatabaseReference mDatabaseref;
    private ProgressBar mProgressCircle;
    private ImageView hidden;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_fragment1);

        gridView = (GridView) findViewById(R.id.gridView);
        mProgressCircle=findViewById(R.id.progress_circular);
        hidden = findViewById(R.id.hidden);
        hidden.setVisibility(View.INVISIBLE);


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
               // gridAdapter = new GridViewAdapter(getApplicationContext(), (ArrayList<Upload>) mUploads);
               // gridView.setAdapter(gridAdapter);



            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Toast.makeText(GalleryFragment1.this,databaseError.getMessage(),Toast.LENGTH_LONG).show();
            }
        });
    }


}
