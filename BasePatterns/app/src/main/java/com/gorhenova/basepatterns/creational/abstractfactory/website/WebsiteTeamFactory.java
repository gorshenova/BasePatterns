package com.gorhenova.basepatterns.creational.abstractfactory.website;

import com.gorhenova.basepatterns.creational.abstractfactory.Developer;
import com.gorhenova.basepatterns.creational.abstractfactory.ProjectManager;
import com.gorhenova.basepatterns.creational.abstractfactory.ProjectTeamFactory;
import com.gorhenova.basepatterns.creational.abstractfactory.Tester;

/**
 * Created by Gorshenova Katherina on 10.04.2017.
 */

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
