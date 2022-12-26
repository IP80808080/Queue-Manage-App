package com.example.queuemanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListOfDoc extends AppCompatActivity {

    private CardView lod01;
    private CardView lod02;
    private CardView lod03;
    private CardView lod04;
    private CardView lod05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_doc);

        lod01 = (CardView)findViewById(R.id.lod01);
        lod02 = (CardView)findViewById(R.id.lod02);
        lod03 = (CardView)findViewById(R.id.lod03);
        lod04 = (CardView)findViewById(R.id.lod04);
        lod05 = (CardView)findViewById(R.id.lod05);

        lod01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListOfDoc.this, D710.class);
                startActivity(intent);
            }
        });

        lod02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListOfDoc.this, D101.class);
                startActivity(intent);
            }
        });

        lod03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListOfDoc.this, D14.class);
                startActivity(intent);
            }
        });

        lod04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListOfDoc.this, D47.class);
                startActivity(intent);
            }
        });

        lod05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListOfDoc.this, D16.class);
                startActivity(intent);
            }
        });


    }
}