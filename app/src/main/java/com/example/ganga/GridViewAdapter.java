package com.example.ganga;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class GridViewAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Upload> mUploads;


    public GridViewAdapter(Context context, ArrayList uploads) {
        this.context = context;
        this.mUploads = uploads;
    }

    @Override
    public int getCount() {
        return mUploads.size();
    }

    @Override
    public Object getItem(int position) {
        return mUploads.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null)
        {
            convertView= LayoutInflater.from(context).inflate(R.layout.image_item,parent,false);
        }

        ImageView img= (ImageView) convertView.findViewById(R.id.image_view_upload);

        final Upload s= (Upload) this.getItem(position);

        Glide.with(convertView).load(s.getImageUrl()).into(img);


        return convertView;
    }
}
