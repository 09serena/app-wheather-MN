package com.example.smart_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ActivityMua extends AppCompatActivity {
    FloatingActionButton fthome;
    TextView txthum,txtgas,txttem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mua);
        fthome = findViewById(R.id.fthome);
        txtgas = findViewById(R.id.txtgas);
        txthum = findViewById(R.id.txthum);
        txttem = findViewById(R.id.txttem);

        fthome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myinten = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(myinten);
            }
        });

        txtgas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenmua = new Intent(getApplicationContext(),Gas.class);
                startActivity(intenmua);
            }
        });
        txttem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intennhietdo = new Intent(getApplicationContext(),Temp.class);
                startActivity(intennhietdo);
            }
        });
        txthum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenhum = new Intent(getApplicationContext(),Humidity.class);
                startActivity(intenhum);
            }
        });
    }
}