package com.gorhenova.basepatterns.creational.builder;

/**
 * Created by Gorshenova Katherina on 10.04.2017.
 */

public abstract class WebsiteBuilder {
    Website website;

    void createWebsite(){
        website =  new Website();
    }

    abstract  void buildName();
    abstract void buildPrice();
    abstract  void buildCms();

    public Website getWebsite() {
        return website;
    }
}
