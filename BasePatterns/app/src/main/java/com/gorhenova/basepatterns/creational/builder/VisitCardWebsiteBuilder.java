package com.gorhenova.basepatterns.creational.builder;

/**
 * Created by Gorshenova Katherina on 10.04.2017.
 */

public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Visit card");
    }

    @Override
    void buildPrice() {
        website.setCms(Cms.WORDPRESS);

    }

    @Override
    void buildCms() {
        website.setPrice(500);
    }
}
