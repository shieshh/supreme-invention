package com.example.jail;

import static android.widget.Toast.LENGTH_LONG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText pass, user;
    Button Signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pass = (EditText) findViewById(R.id.pass);
        user = (EditText) findViewById(R.id.user);
        Signin = (Button) findViewById(R.id.Signin);
        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Signin();
            }
        });
    }

    public void Signin() {

        String username = user.getText().toString().trim();
        String password = pass.getText().toString().trim();
        if (user.getText().toString().equals("Maribojoc") && pass.getText().toString().equals("poblacion")) {

            Intent intent = new Intent(MainActivity.this, Registration.class);
            startActivity(intent);
            Toast.makeText(this, "username and password matched!", LENGTH_LONG).show();
        } else
        {
            Toast.makeText(this, "Wrong username and password!", LENGTH_LONG).show();
        }

    }
}