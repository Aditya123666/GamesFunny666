package com.example.harun.gamesfunny;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class TentangKita extends AppCompatActivity {

    Button sosmed1,sosmed2,sosmed3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_kita);

    sosmed1 = findViewById(R.id.sosmed1);
    sosmed2 = findViewById(R.id.sosmed2);
    sosmed3 = findViewById(R.id.sosmed3);

        sosmed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                String urllink = "https://www.facebook.com";
                browserIntent.setData(Uri.parse(urllink));
                startActivity(browserIntent);
            }
        });
        sosmed2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                String urllink = "https://www.facebook.com";
                browserIntent.setData(Uri.parse(urllink));
                startActivity(browserIntent);
            }
        });
        sosmed3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                String urllink = "https://www.facebook.com";
                browserIntent.setData(Uri.parse(urllink));
                startActivity(browserIntent);
            }
        });
    }
}
