package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    private TextView welcomeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Initialize the TextView
        welcomeText = findViewById(R.id.welcomeText);

        // Get the username from the Intent
        Intent intent = getIntent();
        String username = intent.getStringExtra("USERNAME");

        // Set the welcome message with the username
        if (username != null) {
            welcomeText.setText("Welcome, " + username + "!");
        }
    }
}