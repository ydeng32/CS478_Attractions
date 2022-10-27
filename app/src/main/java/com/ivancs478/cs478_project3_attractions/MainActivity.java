package com.ivancs478.cs478_project3_attractions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button hotelsButton;
    private Button attractionsButton;
    private BroadcastReceiver receiver;
    private IntentFilter filter;
    private static final String toastIntent = "com.ivancs478.cs478_project3_attractions.showToast";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        hotelsButton = findViewById(R.id.button1);
        attractionsButton = findViewById(R.id.button2);

        hotelsButton.setOnClickListener((View v) -> {
            Intent aIntent = new Intent(toastIntent) ;
            sendBroadcast(aIntent, null);

        });

        receiver = new MyReceiver();
        filter = new IntentFilter(toastIntent) ;

        registerReceiver(receiver, filter) ;
    }
}