package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin;
    EditText editTextEmail , editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.buttonLogin);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        //Asignación del evento onClick
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //Button button = (Button)v;
        //CheckBox checkBox = (CheckBox)v;
        //Boolean seleccionado = checkBox.isChecked();
        Log.i("APP" , "Click en Login");

        String Email = editTextEmail.getText().toString();
        String Pass = editTextPassword.getText().toString();

        if (!Email.isEmpty() && !Pass.isEmpty()) {
            Intent intentLogin = new Intent(this, HomeActivity.class);
            intentLogin.putExtra("valorEmail" , Email);
            startActivity(intentLogin);
        } else {
            editTextEmail.setError("Complete el Email y la contraseña");
        }
    }
}
