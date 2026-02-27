package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

// The following lines have been written with assistance from High-Flyer, Deepseek, "Android UI Testing Help", 2026-02-26

public class ShowActivity extends AppCompatActivity {

    public static final String EXTRA_CITY_NAME = "EXTRA_CITY_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView textCity = findViewById(R.id.text_city_name);
        Button backButton = findViewById(R.id.button_back);

        // Get city name from intent
        String cityName = getIntent().getStringExtra(EXTRA_CITY_NAME);
        if (cityName != null) {
            textCity.setText(cityName);
        }

        // Back button closes this activity and returns to MainActivity
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
