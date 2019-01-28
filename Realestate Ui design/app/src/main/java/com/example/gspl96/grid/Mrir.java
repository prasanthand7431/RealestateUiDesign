package com.example.gspl96.grid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Mrir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mrir);
    }

    public void submit(View view) {
        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
    }
}
