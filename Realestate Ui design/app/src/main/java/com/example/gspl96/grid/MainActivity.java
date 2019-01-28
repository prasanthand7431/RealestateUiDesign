package com.example.gspl96.grid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;


public class MainActivity extends AppCompatActivity {




    GridView androidGridView;

    String[] gridViewString = {
            "MATERIAL_ENTRY", "VEHICLE_ENTRY",
            "MRM", "REPORT",
            "TRACKING", "ABOUT",
    } ;
    int[] gridViewImageId = {
            R.drawable.mmmm, R.drawable.testing,R.drawable.eeee,
            R.drawable.rrrr,R.drawable.tttt,R.drawable.yyyy

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomGridViewActivity adapterViewAndroid = new CustomGridViewActivity(MainActivity.this, gridViewString, gridViewImageId);
        androidGridView=(GridView)findViewById(R.id.grid_view_image_text);
        androidGridView.setAdapter(adapterViewAndroid);
        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Mrir.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Vehicle.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Memo.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), Report.class);
                    startActivityForResult(myIntent, 0);
                }



            }
        });

    }
}


