package com.example.myapplicationintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button jbt_submit;
    EditText jet_data1;
    EditText jet_data2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jbt_submit = findViewById(R.id.xbt_submit);
        jet_data1 = findViewById(R.id.xet_data1);
        jet_data2 = findViewById(R.id.xet_data2);

        jbt_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iDetail = new Intent(MainActivity.this, SecondActivity.class);
                iDetail.putExtra("DATA1", jet_data1.getText().toString());
                iDetail.putExtra("DATA2", jet_data2.getText().toString());

                jet_data1.setText("");
                jet_data2.setText("");
                startActivity(iDetail);
            }
        });



    }
}