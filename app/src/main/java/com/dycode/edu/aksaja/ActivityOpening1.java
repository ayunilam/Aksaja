package com.dycode.edu.aksaja;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class ActivityOpening1 extends Activity {

    private static final long SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(ActivityOpening1.this, ActivityOpening2.class);
                startActivity(intent);

                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}