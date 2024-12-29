package com.example.myapplication;
import android.content.Intent;
import com.example.myapplication.WelcomeActivity; // For referencing the WelcomeActivity
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText, passwordEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        submitButton = findViewById(R.id.submitButton);

        // Set the OnClickListener for the submit button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the username input
                String username = usernameEditText.getText().toString();

                // Start the WelcomeActivity and pass the username
                Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                intent.putExtra("USERNAME", username);
                startActivity(intent);
            }
        });
    }
}