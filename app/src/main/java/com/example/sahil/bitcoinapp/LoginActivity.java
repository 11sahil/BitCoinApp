package com.example.sahil.bitcoinapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etName = (EditText) findViewById(R.id.name_login);//getting variable which will access us user name
        final EditText etPassword = (EditText) findViewById(R.id.password_login);//getting variable which will access us user password
        Button btnLogin = (Button) findViewById(R.id.loginBTN_login);//getting variable which will access detail about buttons
        Button btnRegister = (Button) findViewById(R.id.rgstrBTN_login);//getting variable which will access detail about register button in Login

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = etName.getText().toString();//converting to string and transfering to variable
                String password = etPassword.getText().toString();//converting to string and transfering to variable
                SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);//creating shared prefrence variable to save user details

                String savedPassword = preferences.getString("passwd", "");
                String savedUserName = preferences.getString("usrname", "");

                if((user.equals(savedUserName))&&(password.equals(savedPassword))) {
                    Intent displayScreen = new Intent(LoginActivity.this, MainActivity.class);//Sending Intent to Main Activity
                    startActivity(displayScreen);//Begning activity
                }else {
                    Toast tost = Toast.makeText(getApplicationContext(),"INCORRECT USERNAME AND PASSWORD",Toast.LENGTH_LONG);//Creating toast on Incorrect user and passsword
                    tost.setGravity(Gravity.CENTER,0,0);
                    tost.show();
                }
            }
        });


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerScreen = new Intent(LoginActivity.this, RegisterActivity.class);//Sending Intent to Register Activity
                startActivity(registerScreen);//Begning activity
            }
        });
    }

}
