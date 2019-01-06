package com.example.sahil.bitcoinapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] currencyArray = {"Kuwaiti Dinar","Bahraini Dinar","Omani Rial","Jordanian Dinar",
                "Great Britain Pound","Gibraltar Pound","Caymanian Dollar","Euro","Swiss Franc","US Dollar","Canadian Dollar",
                "Australian Dollar","Bruneian Dollar","Singapore Dollar","Libyan Dinar",
                "New Zealand Dollar","Bulgarian Lev","Bosnian Convertible Marka","Arubian Florin","Fijian Dollar"};
        final String currency_name;

        SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);//Created shared variable to extract username
        SharedPreferences.Editor editor = preferences.edit();

        String username = preferences.getString("usrname","");
        final TextView txt1 = ( TextView ) findViewById(R.id.t1name);
        txt1.setText("Hello "+username);//getting whole string together For ex.:-Hello jack(if user is jack)


        ArrayAdapter adapter = new ArrayAdapter<String>(this,//created array adpter to support list view and get content array from "currencyArray"
               R.layout.activity_listview, currencyArray );

        ListView lstView = (ListView) findViewById(R.id.mobile_list);
        lstView.setAdapter(adapter);

       lstView.setOnItemClickListener(this);



    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView tv = (TextView)view;
        Toast.makeText(this,"You Clicked on "+tv.getText(),Toast.LENGTH_LONG).show();//shows which option You clicked
        SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);//Creating shared variable to save currency name
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("curncy_name",(String) tv.getText());
        editor.commit();
        Intent lastscrn = new Intent(MainActivity.this,LastActivity.class);
        startActivity(lastscrn);
    }
}
