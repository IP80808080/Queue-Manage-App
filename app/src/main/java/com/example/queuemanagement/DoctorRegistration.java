package com.example.queuemanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DoctorRegistration extends AppCompatActivity {

    private TextView rePage;
    private EditText r2username, r2Email, r2Phone, r2Password;
    private Button r2Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_registration);

        rePage = findViewById(R.id.rePage);
        rePage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(DoctorRegistration.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}