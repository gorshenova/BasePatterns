package com.gorhenova.basepatterns.creational.factorymethod;

/**
 * Created by Gorshenova Katherina on 11.04.2017.
 */

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
