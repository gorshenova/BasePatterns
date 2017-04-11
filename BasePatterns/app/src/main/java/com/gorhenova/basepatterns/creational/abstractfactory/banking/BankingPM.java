package com.gorhenova.basepatterns.creational.abstractfactory.banking;

import android.util.Log;

import com.gorhenova.basepatterns.creational.abstractfactory.ProjectManager;

/**
 * Created by Gorshenova Katherina on 10.04.2017.
 */

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        Log.i(BankingPM.class.getName(), "BankingPM manages banking code.");
    }
}
