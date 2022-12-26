package com.example.queuemanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeScreen extends AppCompatActivity {

    private ImageButton btsAC;
    private ImageButton btnMed;
    private ImageButton btnBooked;
    private ImageButton btnPre;
    private FloatingActionButton setting;
    private FloatingActionButton logOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        logOut = findViewById(R.id.logOut);

        logOut.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(HomeScreen.this, LoginActivity.class);
                startActivity(intent);
            }
        });



        setting = findViewById(R.id.setting);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, Settings.class);
                startActivity(intent);
            }
        });

        btnPre = findViewById(R.id.btnPre);
        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, PreList.class);
                startActivity(intent);
            }
        });

        btsAC = findViewById(R.id.btsAC);
        btsAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, EmergencyNew.class);
                startActivity(intent);
            }
        });

        btnBooked = findViewById(R.id.btnBooked);
        btnBooked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, Booked.class);
                startActivity(intent);
            }
        });

        btnMed = findViewById(R.id.btnMed);
        btnMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this,ListOfDoc.class);
                startActivity(intent);
            }
        });
    }
}