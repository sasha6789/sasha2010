package com.example.smart_house;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class zagruzka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zagruzka);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}