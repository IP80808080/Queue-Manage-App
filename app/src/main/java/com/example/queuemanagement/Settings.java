package com.example.queuemanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Settings extends AppCompatActivity {

    private Button rProfile;
    private Button rHistory;
    private Button rHelp;
    private Button rMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        rProfile = findViewById(R.id.rProfile);
        rHistory = findViewById(R.id.rHistory);
        rHelp = findViewById(R.id.rHelp);
        rMore = findViewById(R.id.rMore);

        rProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Settings.this, EditProfile.class);
                startActivity(intent);
            }
        });

        rHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Settings.this, LastAppointment.class);
                startActivity(intent);
            }
        });

        rHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Settings.this, AboutUS.class);
                startActivity(intent);
            }
        });

        rMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Settings.this, More.class);
                startActivity(intent);
            }
        });
    }
}