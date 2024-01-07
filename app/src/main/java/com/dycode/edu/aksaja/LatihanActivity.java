package com.dycode.edu.aksaja;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LatihanActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan);
    }

    public void onClickImageHome3(View view) {
        Intent intent = new Intent(this, DashboardActivity.class);
        startActivity(intent);
    }

    public void onClickImageBook3(View view) {
        Intent intent = new Intent(this, MateriActivity.class);
        startActivity(intent);
    }

    public void onClickImageProfile3(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }


}

