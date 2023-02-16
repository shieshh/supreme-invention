package com.example.jail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registration extends AppCompatActivity {


    TextView name,gendr, date;
    EditText Ename, gen, dte;
    TextView mobile;
    EditText mobnum;
    TextView address;
    EditText Eadd;
    Button bttn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        name = (TextView) findViewById(R.id.name);
        Ename = (EditText) findViewById(R.id.Ename);
        gendr = (TextView) findViewById(R.id.gendr);
        gen = (EditText) findViewById(R.id.gen);
        date = (TextView) findViewById(R.id.date);
        dte = (EditText) findViewById(R.id.dte);
        mobile = (TextView) findViewById(R.id.mobile);
        mobnum = (EditText) findViewById(R.id.mobnum);
        address = (TextView) findViewById(R.id.add);
        Eadd = (EditText) findViewById(R.id.Eadd);
        bttn1 = (Button) findViewById(R.id.bttn1);
        bttn1 = findViewById(R.id.bttn1);
        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Registration.this,Capture.class);
                startActivity(intent);
            }
        });

    }
}