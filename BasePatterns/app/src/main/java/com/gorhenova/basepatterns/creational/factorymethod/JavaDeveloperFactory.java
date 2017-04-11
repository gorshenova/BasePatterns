package com.gorhenova.basepatterns.creational.factorymethod;

/**
 * Created by Gorshenova Katherina on 11.04.2017.
 */

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
