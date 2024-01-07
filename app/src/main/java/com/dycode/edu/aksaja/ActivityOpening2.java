package com.dycode.edu.aksaja;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityOpening2 extends Activity {

    private TextView tapTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening2);

        tapTextView = findViewById(R.id.text5);

        // Memberikan listener pada layout utama
        View mainLayout = findViewById(R.id.text5);
        mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk memulai Activity berikutnya setelah tap
                Intent intent = new Intent(ActivityOpening2.this, ActivityOpening3.class);
                startActivity(intent);
                finish(); // Menutup Activity Tap agar tidak dapat diakses kembali dengan menekan tombol kembali
            }
        });

    }
}