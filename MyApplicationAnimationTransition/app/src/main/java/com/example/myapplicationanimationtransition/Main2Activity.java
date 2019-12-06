package com.example.myapplicationanimationtransition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    public void onBackPressed() {
        super.onBackPressed();
        Animatoo.animateSlideRight(Main2Activity.this); //fire the slide left animation}
    }
}
