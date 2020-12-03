package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button jbt_link = (Button) findViewById(R.id.xbt_link);
        jbt_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://www.google.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        TextView jtv_link = (TextView) findViewById(R.id.xtv_link);
        jtv_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://www.bing.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        ImageView jiv_link = (ImageView) findViewById(R.id.xiv_link);
        jiv_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://www.facebook.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        ImageView jib_link = (ImageView) findViewById(R.id.xib_link);
        jib_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://www.twitter.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }
}