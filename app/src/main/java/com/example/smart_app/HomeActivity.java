package com.example.smart_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeActivity extends AppCompatActivity {
    ImageButton btndien,btnnuoc,btnmua;
    TextView txtdien,txtnuoc,txtmua ;
    FloatingActionButton flthongtin,fthome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btndien = findViewById(R.id.btndien);
        btnmua = findViewById(R.id.btnmua);
        btnnuoc = findViewById(R.id.btnnuoc);
        flthongtin = findViewById(R.id.flthongtin);
        fthome = findViewById(R.id.fthome);
        txtdien = findViewById(R.id.txtdien);
        txtmua = findViewById(R.id.txtmua);
        txtnuoc = findViewById(R.id.txtnuoc);

        txtdien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getApplicationContext(),ActivityDien.class);
                startActivity(myintent);
            }
        });
        txtnuoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getApplicationContext(),ActivityNuoc.class);
                startActivity(myintent);
            }
        });
        txtmua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getApplicationContext(),ActivityMua.class);
                startActivity(myintent);
            }
        });

        flthongtin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Profile.class);
                startActivity(intent);
            }
        });
        btndien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
       });
        fthome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(myintent);
            }
        });
    }
}