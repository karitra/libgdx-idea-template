package com.example;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/*
 * TODO: rename imported application name
 */
import com.example.MyApp.TheGame;


public class DesktopStarter {

    public static void main(String[] args) {

        //
        // Just an example here should be constructed from platform
        // depended, pre-setup configs
        //
        LwjglApplicationConfiguration conf = new LwjglApplicationConfiguration();

        conf.title   = "Your title here";
        conf.useGL20 = true;
        conf.width   = 800;
        conf.height  = 480;

        //
        // Application entry point
        //
        new LwjglApplication( new TheGame(), conf );
    }
}
