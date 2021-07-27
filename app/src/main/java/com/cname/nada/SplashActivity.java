package com.cname.nada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import static com.cname.nada.functions.CheckInternetState.isConnected;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        isConnected(getApplicationContext());

        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        finish();

    }
}