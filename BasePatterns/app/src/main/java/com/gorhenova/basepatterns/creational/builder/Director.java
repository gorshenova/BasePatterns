package com.gorhenova.basepatterns.creational.builder;

/**
 * Created by Gorshenova Katherina on 10.04.2017.
 *
 * Вспомагательный класс, который будет создавать нужный вебсайт
 */

public class Director {

    WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    Website buildWebsite(){
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

        Website website = builder.getWebsite();
        return website;
    }
}
