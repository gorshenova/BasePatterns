package com.gorhenova.basepatterns.creational.abstractfactory.banking;

import android.util.Log;

import com.gorhenova.basepatterns.creational.abstractfactory.Tester;

/**
 * Created by Gorshenova Katherina on 10.04.2017.
 */

public class QATester implements Tester {
    @Override
    public void testCode() {
        Log.i(QATester.class.getName(), "QATester tests banking code.");
    }
}
