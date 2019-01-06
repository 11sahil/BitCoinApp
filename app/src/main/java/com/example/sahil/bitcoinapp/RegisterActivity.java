package com.example.sahil.bitcoinapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText userName = (EditText) findViewById(R.id.name_register);
        final EditText password = (EditText) findViewById(R.id.password_register);
        Button btnRegister = (Button) findViewById(R.id.rgstrBTN_register);


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences = getSharedPreferences("MYPREFS",MODE_PRIVATE);//Created Shared Prefrence user details
                String newUser  = userName.getText().toString();
                String newPassword = password.getText().toString();

                SharedPreferences.Editor editor = preferences.edit();

                editor.putString("usrname",newUser);//Inserting value in  sharedprefrence variable
                editor.commit();
                editor.putString("passwd", newPassword);//Inserting value in  sharedprefrence variable
                editor.commit();
                Intent loginScreen = new Intent(RegisterActivity.this, LoginActivity.class);//Sending Intent to Login Activity
                startActivity(loginScreen);//Begning activity
            }
        });

    }
}
