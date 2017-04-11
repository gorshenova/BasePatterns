package com.gorhenova.basepatterns.creational.abstractfactory.banking;

import android.util.Log;

import com.gorhenova.basepatterns.creational.abstractfactory.Developer;

/**
 * Created by Gorshenova Katherina on 10.04.2017.
 */

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        Log.i(JavaDeveloper.class.getName(), "Java developer writes java code.");
    }
}
