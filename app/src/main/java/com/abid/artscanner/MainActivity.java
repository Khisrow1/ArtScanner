package com.abid.artscanner;

import android.Manifest;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton spanish_btn;
    ImageButton french_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spanish_btn = findViewById(R.id.ui_spanish);
        french_btn = findViewById(R.id.ui_french);

        spanish_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ScannerActivity.class);
                intent.putExtra("Title", "Versión en español");
                intent.putExtra("Lang", "Spanish");
                startActivity(intent);
            }
        });

        french_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ScannerActivity.class);
                intent.putExtra("Title", "Version française");
                intent.putExtra("Lang", "French");
                startActivity(intent);
            }
        });
    }
}
