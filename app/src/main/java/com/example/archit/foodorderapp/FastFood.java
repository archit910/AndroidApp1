package com.example.archit.foodorderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FastFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_food);
    }
    public void MCD(View view)
    {
        Intent i = new Intent();
        i.setClass(getApplicationContext(),Mcd.class);
        startActivity(i);

    }
    public void KFC(View view)
    {

        Intent i = new Intent();
        i.setClass(getApplicationContext(),Kfc.class);
        startActivity(i);

    }
    public void DOMINO(View view)
    {
        Intent i = new Intent();
        i.setClass(getApplicationContext(),Domino.class);
        startActivity(i);

    }
}
