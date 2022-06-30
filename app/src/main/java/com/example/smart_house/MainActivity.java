package com.example.smart_house;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void knopka1(View v){
        Intent intent = new Intent(this, home1.class);
        startActivity(intent);
    }
    public void knopka3(View v){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

}