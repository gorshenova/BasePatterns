package com.gorhenova.basepatterns.creational.abstractfactory.website;

import android.util.Log;

import com.gorhenova.basepatterns.creational.abstractfactory.Developer;

/**
 * Created by Gorshenova Katherina on 10.04.2017.
 */

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        Log.i(PhpDeveloper.class.getName(), "Php developer writes php code.");
    }
}
