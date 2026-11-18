package com.example.noaapp4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCall = findViewById(R.id.btnCall);
        Button btnWebsite = findViewById(R.id.btnWebsite);

        // כפתור חיוג
        btnCall.setOnClickListener(v -> {
            String phone = "0501234567";

            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + phone));
            startActivity(intent);
        });

        // כפתור פתיחת אתר
        btnWebsite.setOnClickListener(v -> {
            String url = "https://www.google.com";

            Intent intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse(url));
            startActivity(intent);
        });
    }
}

