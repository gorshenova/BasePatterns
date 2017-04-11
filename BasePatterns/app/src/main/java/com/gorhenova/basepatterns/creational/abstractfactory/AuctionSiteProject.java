package com.gorhenova.basepatterns.creational.abstractfactory;

import android.util.Log;

import com.gorhenova.basepatterns.creational.abstractfactory.website.WebsiteTeamFactory;

/**
 * Created by Gorshenova Katherina on 10.04.2017.
 */

public class AuctionSiteProject {

    public void create(){
        ProjectTeamFactory teamFactory =  new WebsiteTeamFactory();
        Developer developer =  teamFactory.getDeveloper();
        Tester tester =  teamFactory.getTester();
        ProjectManager manager = teamFactory.getProjectManager();

        Log.i(AuctionSiteProject.class.getName(), "Creating auction site project...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
