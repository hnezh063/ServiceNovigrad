package com.example.servicenovigrad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private EditText etEmail, etPassword;
    private Button btnLogin, btnRegisterClient, btnRegisterEmploye;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegisterClient = findViewById(R.id.btnRegisterClient);
        btnRegisterEmploye = findViewById(R.id.btnRegisterEmploye);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etEmail.getText().toString().trim();
                String password = etPassword.getText().toString().trim();
                login(email, password);
            }
        });

        btnRegisterClient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerClient();
            }
        });

        btnRegisterEmploye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerEmploye();

            }
        });
    }

    private void login(String email, String password) {
        if (email.equals("admin") && password.equals("123admin456")) {
            // Logging in as Administrator
            Toast.makeText(MainActivity.this, "Logged in as Administrator", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Welcome.class);
            intent.putExtra("role", "Administrator");
            startActivity(intent);
        } else {
            // If there is invalid credentials
            Toast.makeText(MainActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
        }

    }

    public void registerClient() {
        Intent intent = new Intent(this, Client.class);
        startActivity(intent);
    }

    public void registerEmploye() {
        Intent intent = new Intent(this, Employe.class);
        startActivity(intent);
    }
}