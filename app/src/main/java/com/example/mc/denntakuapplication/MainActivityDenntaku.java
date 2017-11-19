package com.example.mc.denntakuapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivityDenntaku extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_denntaku);

        int value = 1 + 1;

        TextView textView = (TextView) findViewById(R.id.textview);
        textView.setText(String.valueOf(value));
    }
}
