package com.example.archit.foodorderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class North extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north);
    }
    public void Haldi(View view)
    {
        Intent i = new Intent();
        i.setClass(getApplicationContext(),Haldi.class);
        startActivity(i);

    }
    public void pind(View view)
    {

        Intent i = new Intent();
        i.setClass(getApplicationContext(),Pind.class);
        startActivity(i);

    }
    public void chawla(View view)
    {
        Intent i = new Intent();
        i.setClass(getApplicationContext(),Chawla.class);
        startActivity(i);

    }
}
