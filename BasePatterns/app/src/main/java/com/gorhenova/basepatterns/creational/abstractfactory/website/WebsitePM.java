package com.gorhenova.basepatterns.creational.abstractfactory.website;

import android.util.Log;

import com.gorhenova.basepatterns.creational.abstractfactory.ProjectManager;

/**
 * Created by Gorshenova Katherina on 10.04.2017.
 */

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        Log.i(WebsitePM.class.getName(), "Website PM manages website project.");
    }
}
