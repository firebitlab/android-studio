package com.example.myapplicationintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView jet_data1;
    TextView jet_data2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        jet_data1 = findViewById(R.id.xet_data1);
        jet_data2 = findViewById(R.id.xet_data2);

        Intent iGet = getIntent();
        jet_data1.setText(iGet.getStringExtra("DATA1"));
        jet_data2.setText(iGet.getStringExtra("DATA2"));
    }
}