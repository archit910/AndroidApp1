package com.example.archit.foodorderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OrderFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_food);
    }
    public void fastfood(View view)
    {
        Intent i = new Intent();
        i.setClass(getApplicationContext(),FastFood.class);
        startActivity(i);


    }
    public void north(View view)
    {
        Intent i = new Intent();
        i.setClass(getApplicationContext(),North.class);
        startActivity(i);

    }
    public void south(View view)
    {
        Intent i = new Intent();
        i.setClass(getApplicationContext(),South.class);
        startActivity(i);

    }
}
