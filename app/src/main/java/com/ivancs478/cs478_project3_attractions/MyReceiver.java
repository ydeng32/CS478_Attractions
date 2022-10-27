package com.ivancs478.cs478_project3_attractions;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context arg0, Intent arg1) {
        // TODO Auto-generated method stub
        Toast.makeText(arg0, "Programmatic receiver in action" /* "Static receiver in action! " */,
                Toast.LENGTH_LONG).show() ;
    }
}







