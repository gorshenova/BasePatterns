package com.gorhenova.basepatterns.creational.factorymethod;

import android.util.Log;

/**
 * Created by Gorshenova Katherina on 11.04.2017.
 */

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        Log.i(PhpDeveloper.class.getName(), "Php developer writes php code...");
    }
}
