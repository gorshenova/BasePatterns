package com.gorhenova.basepatterns.creational.abstractfactory.website;

import android.util.Log;

import com.gorhenova.basepatterns.creational.abstractfactory.Tester;

/**
 * Created by Gorshenova Katherina on 10.04.2017.
 */

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        Log.i(ManualTester.class.getName(), "Manual tester tests website.");
    }
}
