package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("3CXXX7stx8plIiXm2bLAVLKy9xylhy8cCCC4jGNS")
                .clientKey("HRfNXKboIpaXd8KGhZZrBHECH7RBlMoMVlo2kcnb")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
