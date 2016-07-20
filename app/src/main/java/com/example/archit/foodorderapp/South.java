package com.example.archit.foodorderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class South extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south);
    }
    public void SB(View view)
    {
        Intent i = new Intent();
        i.setClass(getApplicationContext(),Sbhawan.class);
        startActivity(i);

    }

    public void SR(View view)
    {
        Intent i = new Intent();
        i.setClass(getApplicationContext(),Sratna.class);
        startActivity(i);

    }
}
