package com.gorhenova.basepatterns.creational.abstractfactory;

import android.util.Log;

import com.gorhenova.basepatterns.creational.abstractfactory.banking.BankingTeamFactory;

/**
 * Created by Gorshenova Katherina on 10.04.2017.
 */

public class SuperBankSystem {

    public void create(){
        ProjectTeamFactory teamFactory =  new BankingTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester =  teamFactory.getTester();
        ProjectManager manager =  teamFactory.getProjectManager();

        Log.i(SuperBankSystem.class.getName(), "Creating bank system...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
