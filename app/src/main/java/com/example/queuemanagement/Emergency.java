package com.example.queuemanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Emergency extends AppCompatActivity {

    private FloatingActionButton btnEAdd01;
    private FloatingActionButton btnEAdd02;
    private FloatingActionButton btnEAdd03;
    private TextView add1;
    private TextView add2;
    private TextView add3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        btnEAdd01 = findViewById(R.id.btnEAdd01);
        btnEAdd02 = findViewById(R.id.btnEAdd02);
        btnEAdd03 = findViewById(R.id.btnEAdd03);
        add1 = findViewById(R.id.add1);
        add2 = findViewById(R.id.add2);
        add2 = findViewById(R.id.add3);


        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Emergency.this, Aid01.class);
                startActivity(intent);
            }
        });

        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Emergency.this, Aid02.class);
                startActivity(intent);
            }
        });

        add3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Emergency.this, Aid03.class);
                startActivity(intent);
            }
        });




    }

    private void makeCall() {

        try {

            String phoneNumber = "5551234";

            Intent intent = new Intent(Intent.ACTION_CALL);

            intent.setData(Uri.parse("tel:" + phoneNumber));

            startActivity(intent);

        } catch (Exception e) {

            Toast.makeText(this, "Error in your phone call" + e.getMessage(), Toast.LENGTH_SHORT).show();

        }

    }

}
