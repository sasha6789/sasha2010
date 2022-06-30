package com.example.smart_house;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home1);
    }
    public void lolol1(View v){
        Intent intent = new Intent(this, home2.class);
        startActivity(intent);
    }
    public void lolol2(View v){
        Intent intent = new Intent(this, home2.class);
        startActivity(intent);
    }
}