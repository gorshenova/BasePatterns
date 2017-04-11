package com.gorhenova.basepatterns.creational.factorymethod;

import android.util.Log;

/**
 * Created by Gorshenova Katherina on 11.04.2017.
 */

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        Log.i(CppDeveloper.class.getName(), "C++ developer writes php code...");
    }
}
