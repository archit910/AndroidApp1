package com.example.archit.foodorderapp;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;

public class Lelo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lelo);
        Toast.makeText(Lelo.this, "Please Rate my App Mam !", Toast.LENGTH_SHORT).show();
        RatingBar ratingBar =(RatingBar) findViewById(R.id.ratingBar2);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(Lelo.this, "! Thankyou !", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
