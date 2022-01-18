package com.android.uraall.taxiapp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;

import com.google.android.gms.stats.WakeLock;
import com.google.firebase.auth.FirebaseAuth;

public class ChooseModeActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_mode);

    }

    public void goToPassengerSignIn(View view) {
        startActivity(new Intent(
                ChooseModeActivity.this,
                PassengerSignInActivity.class
        ));
    }

    public void goToDriverSignIn(View view) {
        startActivity(new Intent(
                ChooseModeActivity.this,
                DriverSignInActivity.class
        ));
    }
}
