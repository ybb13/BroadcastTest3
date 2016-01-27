package com.s15.mars.com.broadcasttest3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/1/27.
 */
public class BroadcastHolher extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"lllllll",Toast.LENGTH_SHORT).show();
    }
}
