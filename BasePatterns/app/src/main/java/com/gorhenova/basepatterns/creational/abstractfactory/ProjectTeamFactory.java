package com.gorhenova.basepatterns.creational.abstractfactory;

/**
 * Created by Gorshenova Katherina on 10.04.2017.
 *
 * Сущность, которая будет создавать множество взаимосвязанных объектов
 */

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
