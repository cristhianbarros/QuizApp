package com.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtLatitude, edtLongitude;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



    }

    public void sendUbication(View v) {
        edtLatitude = (EditText) findViewById(R.id.edtLatitude);
        edtLongitude = (EditText) findViewById(R.id.edtLongitude);


        Intent i = new Intent(MainActivity.this, MapsActivity.class);
        i.putExtra("latitude", edtLatitude.getText().toString());
        i.putExtra("longitude", edtLongitude.getText().toString());
        startActivity(i);

        Toast.makeText(getApplicationContext(),"Sending your Ubication", Toast.LENGTH_LONG).show();
    }

}
