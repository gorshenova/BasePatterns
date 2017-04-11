package com.gorhenova.basepatterns.creational.factorymethod;

/**
 * Created by Gorshenova Katherina on 11.04.2017.
 * Клиент
 */

public class Program {

    public void start() {
        DeveloperFactory developerFactory = cretaeDeveloperBySpeciality("php");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    public DeveloperFactory cretaeDeveloperBySpeciality(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        }else if(specialty.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown speciality.");
        }
    }

}
