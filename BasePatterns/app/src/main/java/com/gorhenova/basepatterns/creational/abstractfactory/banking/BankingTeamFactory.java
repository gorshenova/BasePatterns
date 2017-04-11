package com.gorhenova.basepatterns.creational.abstractfactory.banking;

import com.gorhenova.basepatterns.creational.abstractfactory.Developer;
import com.gorhenova.basepatterns.creational.abstractfactory.ProjectManager;
import com.gorhenova.basepatterns.creational.abstractfactory.ProjectTeamFactory;
import com.gorhenova.basepatterns.creational.abstractfactory.Tester;

/**
 * Created by Gorshenova Katherina on 10.04.2017.
 * Фабрика команды, которая будет создавать 1 разработчика, 1 тестировщика и 1 менеджера
 */

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
