package com.gorhenova.basepatterns;

import android.app.Application;
import android.content.Context;

/**
 * Created by Gorshenova Katherina on 10.04.2017.
 */

public class BPApplication extends Application {

    private static BPApplication instance;
    @Override
    public void onCreate() {
        super.onCreate();
        instance =  this;
    }

    public static Context getContext(){
        return instance;
    }
}
