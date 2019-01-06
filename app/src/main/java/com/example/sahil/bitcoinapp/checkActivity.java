package com.example.sahil.bitcoinapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

public class checkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);//Creating Shared prefrence variable to get user detail so as to check entry condition

        String username = preferences.getString("usrname","");//providing value to username variable
        TextView t1 =(TextView)findViewById(R.id.t1name);

        String intro = "Hey "+username;//Concatinating whole string

        if(username.length() == 0)//checking entry condition if user has enter his details or not
        {

            Intent intent = new Intent(this,LoginActivity.class);//Sending Intent to Login Activity
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            finish();
            startActivity(intent);//Begning activity

        }else
        {

            Intent intent = new Intent(this,MainActivity.class);//Sending Intent to Main Activity
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            finish();
            startActivity(intent);//Begning activity

        }

    }
    @Override
    public void onResume (){
        super.onResume();
        Intent mini = new Intent(checkActivity.this,MainActivity.class);
        startActivity(mini);

    }
    @Override
    public void onPause (){
        super.onPause();
        Intent mini = new Intent(checkActivity.this,MainActivity.class);
        startActivity(mini);

    }
}
