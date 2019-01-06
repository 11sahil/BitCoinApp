package com.example.sahil.bitcoinapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        TextView val = (TextView)findViewById(R.id.cur_value);//getting variable for currency value
        TextView nam = (TextView)findViewById(R.id.cur_name);//getting variable for currency name
        SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);//Creating Shared prefrence to access on saved value from previous activity
        String c_name=preferences.getString("curncy_name","");//Putting value in string
        nam.setText(c_name);
        switch(c_name){//checking variable with currency name
            case "Kuwaiti Dinar":val.setText("1125.62");
                                 nam.setText(c_name);
                                 break;
            case "Bahraini Dinar":val.setText("1397.75");
                nam.setText(c_name);
                break;
            case "Omani Rial":val.setText("1427.98");
                nam.setText(c_name);
                break;
            case "Jordanian Dinar":val.setText("2628.70");
                nam.setText(c_name);
                break;
            case "Great Britain Pound":val.setText(" 2911.88");
                nam.setText(c_name);
                break;
            case "Gibraltar Pound":val.setText("2889.68");
                nam.setText(c_name);
                break;
            case "Caymanian Dollar":val.setText("3108.79" );
                nam.setText(c_name);
                break;
            case "Euro":val.setText("3224.68");
                nam.setText(c_name);
                break;
            case "Swiss Franc":val.setText("3639.00");
                nam.setText(c_name);
                break;
            case "US Dollar":val.setText("3705.00");
                nam.setText(c_name);
                break;
            case "Canadian Dollar":val.setText("4979.33");
                nam.setText(c_name);
                break;
            case "Australian Dollar":val.setText("5277.77");
                nam.setText(c_name);
                break;
            case "Bruneian Dollar":val.setText("5834.83");
                nam.setText(c_name);
                break;
            case "Singapore Dollar":val.setText("5047.32");
                nam.setText(c_name);
                break;
            case "Libyan Dinar":val.setText("5132.66");
                nam.setText(c_name);
                break;
            case "New Zealand Dollar":val.setText("5520.32");
                nam.setText(c_name);
                break;
            case "Bulgarian Lev":val.setText("6301.00");
                nam.setText(c_name);
                break;
            case "Bosnian Convertible Marka":val.setText("6307.66");
                nam.setText(c_name);
                break;
            case "Arubian Florin":val.setText("6658.22");
                nam.setText(c_name);
                break;
            case "Fijian Dollar":val.setText("7929.01");
                nam.setText(c_name);
                break;
        }

    }
    @Override
    public void onRestart (){
        super.onRestart();
        Intent mini = new Intent(LastActivity.this,MainActivity.class);//Sending Intent to Main Activity
        startActivity(mini);//Begning activity

    }
}
