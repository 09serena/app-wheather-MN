package com.example.smart_app;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtuser,edtpassword;
    TextView toast,mtcreat;
    Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtuser = findViewById(R.id.username);
        edtpassword = findViewById(R.id.password);
        mtcreat = findViewById(R.id.mtcreate);
        btnlogin = findViewById(R.id.btnlogin);
        toast  = findViewById(R.id.toast);


        mtcreat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SignupActivity.class);
                startActivity(intent);
            }
        });
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtuser.getText().length() !=0 && edtpassword.getText().length() != 0){
                    String username = edtuser.getText().toString();
                    String password = edtpassword.getText().toString();

                    if (username.equals("admin") && password.equals("12345")){
                        Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                        startActivity(intent);
                    }
                    else {
                        toast.setText("User/Password incorrect");
                        //Toast.makeText(MainActivity.this, "User/Password incorrect", Toast.LENGTH_SHORT).show();
                    }
            }
        };



    });
    }
}