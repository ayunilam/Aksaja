package com.dycode.edu.aksaja;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void onClickImageBook1(View view) {
        Intent intent = new Intent(this, MateriActivity.class);
        startActivity(intent);
    }

    public void onClickImageFlag1(View view) {
        Intent intent = new Intent(this, LatihanActivity.class);
        startActivity(intent);
    }

    public void onClickImageProfile1(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

}