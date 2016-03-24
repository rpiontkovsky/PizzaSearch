package com.romao.pizzasearch;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

import com.romao.pizzasearch.common.Route;


/**
 * Created by rpiontkovsky on 3/24/2016.
 */
public class BootActivity extends AppCompatActivity {

    private static final int MSG_GO_FORWARD = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boot);
    }

    @Override
    protected void onStart() {
        super.onStart();
        checkAppState();
    }


    private void checkAppState() {
        mHandler.sendEmptyMessageDelayed(MSG_GO_FORWARD, 5000);
    }

    private void goForward() {
        Route.toMainActivity(this);
    }

    private final Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == MSG_GO_FORWARD) {
                goForward();
            }
        }
    };
}
