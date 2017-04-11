package com.gorhenova.basepatterns.creational.factorymethod;


import android.util.Log;

/**
 * Created by Gorshenova Katherina on 11.04.2017.
 */

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        Log.i(JavaDeveloper.class.getName(), "Java developer writes java code...");
    }
}
