package com.example.archit.foodorderapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LoginActivity();
        setContentView(R.layout.activity_main);
        TextView tvmain = (TextView) findViewById(R.id.textViewmain);
       // tvmain.setTextColor(Color.RED);
    }
    public void orderFood(View view)
    {
        Intent i = new Intent();
        i.setClass(getApplicationContext(),OrderFood.class);
        startActivity(i);
    }
    public void Start(View view)
    {
        Intent i = new Intent();
        i.setClass(getApplicationContext(),Lelo.class);
        startActivity(i);

    }
    public void LoginActivity()
    {
        Intent i = new Intent();
        i.setClass(getApplicationContext(),Login.class);
        startActivity(i);
    }

}
