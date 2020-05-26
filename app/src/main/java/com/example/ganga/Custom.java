package com.example.ganga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
public class Custom extends AppCompatActivity {

    private ViewPager mviewpager;
    intViewAdapter mintViewAdapter;
    TabLayout tabLayout;
    Button btnnext;
    int position=0;
    Button get;
    Animation btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_custom);
        btnnext=findViewById(R.id.button);
        get=findViewById(R.id.getstarted);
        tabLayout=findViewById(R.id.tab_indicator);
        btn= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.button_animation);

        final List<screenItem> mList=new ArrayList<>();
        mList.add(new screenItem("GHaT","Ganga Heritage and Tributaries",R.drawable.logo));
        mList.add(new screenItem("A Journey to Explore","Explore Ghats Crematories RiverFronts and much more",R.drawable.usr1));
        mList.add(new screenItem("Search","You can search Ghats according to your filter",R.drawable.usr1));
        mList.add(new screenItem("Add Information","You can add ghats which are not present in this app",R.drawable.usr1));
        mList.add(new screenItem("Use App in Your Language","You can use app in different popular Languages",R.drawable.usr1));
        mviewpager=findViewById(R.id.screenvp);
        mintViewAdapter=new intViewAdapter(this,mList);
        mviewpager.setAdapter(mintViewAdapter);

        tabLayout.setupWithViewPager(mviewpager);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position=mviewpager.getCurrentItem();
                if(position<mList.size())
                {
                    position++;
                    mviewpager.setCurrentItem(position);
                }
                if(position==mList.size())
                {
                    loadlastscreen();
                }
            }
        });
        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Custom.this , Main2Activity.class);
                startActivity(intent1);
            }
        });
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition()==mList.size())
                {
                    loadlastscreen();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    private void loadlastscreen() {
        btnnext.setVisibility(View.INVISIBLE);
        get.setVisibility(View.VISIBLE);
        tabLayout.setVisibility(View.INVISIBLE);
        get.setAnimation(btn);

    }
}
