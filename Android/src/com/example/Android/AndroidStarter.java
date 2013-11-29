package com.example.Android;

import android.os.Bundle;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.example.MyApp.TheGame;

/**
 * User:      kaa
 * Timestamp: 11/29/13 4:15 PM
 */
public class AndroidStarter extends AndroidApplication {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //
        // Sample setup to give something to start with, rewrite as soon as possible
        //
        AndroidApplicationConfiguration c = new AndroidApplicationConfiguration();
        c.useAccelerometer = false;
        c.useCompass       = false;
        c.useWakelock      = true;
        c.useGL20          = true;

        initialize( new TheGame(), c);
    }
}
