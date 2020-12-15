package com.example.myapplicationbgcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LinearLayout rl = (LinearLayout) findViewById(R.id.layout1);
        rl.setBackgroundColor(Color.RED);


        LinearLayout r2 = (LinearLayout) findViewById(R.id.layout2);
        r2.setBackgroundColor(Color.GREEN);


        LinearLayout r3 = (LinearLayout) findViewById(R.id.layout3);
        r3.setBackgroundColor(getResources().getColor(R.color.mycolor) );
    }
}