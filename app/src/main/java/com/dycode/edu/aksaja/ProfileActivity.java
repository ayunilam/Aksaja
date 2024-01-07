package com.dycode.edu.aksaja;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ProfileActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageButton changeprofileButton = findViewById(R.id.changeprofile);
        changeprofileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Panggil metode untuk mengarahkan ke UbahProfilActivity
                goToUbahProfilActivity();
            }
        });
    }

    public void goToUbahProfilActivity() {
        Intent intent = new Intent(this, UbahProfActivity.class);
        startActivity(intent);
    }

    public void onClickImageHome4(View view) {
        Intent intent = new Intent(this, DashboardActivity.class);
        startActivity(intent);
    }

    public void onClickImageBook4(View view) {
        Intent intent = new Intent(this, MateriActivity.class);
        startActivity(intent);
    }

    public void onClickImageFlag4(View view) {
        Intent intent = new Intent(this, LatihanActivity.class);
        startActivity(intent);
    }
}