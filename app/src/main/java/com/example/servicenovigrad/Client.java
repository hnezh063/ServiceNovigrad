package com.example.servicenovigrad;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class Client extends AppCompatActivity {

        private EditText etFirstName, etLastName, etEmail, etPassword;
        private Button btnRegister;

    public Client(Button btnRegister) {
        this.btnRegister = btnRegister;
    }

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_client);

            etFirstName = findViewById(R.id.etFirstName);
            etLastName = findViewById(R.id.etLastName);
            etEmail = findViewById(R.id.etEmail);
            etPassword = findViewById(R.id.etPassword);

            btnRegister.setOnClickListener(v -> {
                String firstName = etFirstName.getText().toString().trim();
                String lastName = etLastName.getText().toString().trim();
                String email = etEmail.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() ||
                        password.isEmpty()) {
                    Toast.makeText(Client.this, "Please fill in all the fields", Toast.LENGTH_SHORT).show();
                } else {
                    registerClient(); // When all fields are filled in
                }
            });
        }

        // Performs the registration for the student
        private void registerClient() {
            Toast.makeText(Client.this, "Client registration successful!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Welcome.class);
            intent.putExtra("role", "Client");
            System.out.println("bienvenue");
            startActivity(intent);
        }
    }
