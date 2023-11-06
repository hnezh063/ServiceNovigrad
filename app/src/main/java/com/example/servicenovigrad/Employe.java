package com.example.servicenovigrad;

import android.content.Intent;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Employe extends AppCompatActivity {

    // Performs the registration for the tutor


    private void registerEmploye() {

        Toast.makeText(Employe.this, "Employe registration successful!", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, Welcome.class);
        intent.putExtra("role", "Employe");
        startActivity(intent);
    }
}
