package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView outUser;
    Button Button1;
    static String[] text = {"You bit MATEMOTICHKA %i% times",};
    static int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button1 = (Button) findViewById(R.id.Button1);
        outUser = (TextView) findViewById(R.id.outUser);

        // Button1.setBackgroundColor(Color.rgb(200, 100, 150));
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String out = text[0].replaceAll("%i%", ++i + "") +"\n";
//                switch (i) {
//                case
//                }
                text[0].replaceAll("%i%", ++i + "");
                outUser.setText(out);
            }
        });


    }

}
