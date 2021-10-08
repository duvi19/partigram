package com.example.partigram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("6kQepM4tQ1S7l0HXStZ268RtufVorsFjvgvOaSKG")
                .clientKey("R1475xDErER86gtXTvgY4fApngvuPUyEnlESBpuA")
                .server("https://parseapi.back4app.com").build()
                //vijpwajezGJDHjCfBw6TdW5dblgMpOBukXwVVblJ
        );
    }
}
