package com.example.ganga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RiverData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_river_data);

        TextView name = findViewById(R.id.rivername);
        TextView source = findViewById(R.id.riversource);
        TextView destname = findViewById(R.id.riverdest);
        TextView cityname = findViewById(R.id.rivercity);
        TextView ghatname = findViewById(R.id.riverghat);
        TextView length = findViewById(R.id.riverlen);
        TextView area = findViewById(R.id.riverarea);


        Bundle bun = getIntent().getExtras();
        String rivername , riversource,dest,city,ghat,len , ar;
        rivername= bun.getString("Name");
        riversource = bun.getString("Source");
        dest = bun.getString("Destination");
        city = bun.getString("city");
        ghat = bun.getString("ghat");
        len = bun.getString("Length");
        ar = bun.getString("Area");


        name.setText(rivername);
        source.setText(riversource);
        destname.setText(dest);
        cityname.setText(city);
        ghatname.setText(ghat);
        length.setText(len);
        area.setText(ar);

    }
}
