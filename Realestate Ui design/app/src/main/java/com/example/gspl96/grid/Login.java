package com.example.gspl96.grid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void btn(View view) {
        Intent intent = new Intent(Login.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
