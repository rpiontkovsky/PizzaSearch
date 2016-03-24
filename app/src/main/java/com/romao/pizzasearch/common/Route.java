package com.romao.pizzasearch.common;

import android.app.Activity;
import android.content.Intent;

import com.romao.pizzasearch.MainActivity;

/**
 * Created by rpiontkovsky on 3/24/2016.
 */
public class Route {

    public static void toMainActivity(Activity activity) {
        Intent intent = new Intent(activity, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        activity.startActivity(intent);
    }
}
