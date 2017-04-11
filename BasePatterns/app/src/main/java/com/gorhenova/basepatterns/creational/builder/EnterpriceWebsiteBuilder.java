package com.gorhenova.basepatterns.creational.builder;

/**
 * Created by Gorshenova Katherina on 10.04.2017.
 */

public class EnterpriceWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Enter price website");
    }

    @Override
    void buildPrice() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildCms() {
        website.setPrice(10000);
    }
}
