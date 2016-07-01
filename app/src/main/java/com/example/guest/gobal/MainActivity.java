package com.example.guest.gobal;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mAppNameTextView;
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = (Button) findViewById(R.id.button1);
            mButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, HotelsActivity.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this,  "BOOK NOW!", Toast.LENGTH_LONG).show();
                }
            });


        mButton2 = (Button) findViewById(R.id.button2);
            mButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, FlightsActivity.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this,  "FLY AWAY!", Toast.LENGTH_LONG).show();
                }
            });


        mButton3 = (Button) findViewById(R.id.button3);
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AutosActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,  "VROOM!", Toast.LENGTH_LONG).show();
            }

        });

        mAppNameTextView = (TextView) findViewById(R.id.appNameTextView);
        Typeface caviarDreamsFont = Typeface.createFromAsset(getAssets(), "fonts/CaviarDreams.ttf");
        mButton1.setTypeface(caviarDreamsFont);
        mButton2.setTypeface(caviarDreamsFont);
        mButton3.setTypeface(caviarDreamsFont);
    }
}
