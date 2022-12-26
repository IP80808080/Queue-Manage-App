package com.example.queuemanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegistrationOption extends AppCompatActivity {

    private TextView back;
    private Button rDoctor, rPatient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrationoption);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistrationOption.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        rPatient = findViewById(R.id.rPatient);
        rDoctor = findViewById(R.id.rDoctor);

        rPatient.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(RegistrationOption.this, PatientRegistration.class);
                startActivity(intent);
            }
        });

        rDoctor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(RegistrationOption.this, DoctorRegistration.class);
                startActivity(intent);
            }
        });
    }
}