package com.gorhenova.basepatterns.creational.builder;

import android.util.Log;
import android.widget.Toast;

import com.gorhenova.basepatterns.BPApplication;

/**
 * Created by Gorshenova Katherina on 10.04.2017.
 *
 * Класс клиент
 */

public class BuildWebsiteRunner {

    public void start(){
        Director director = new Director();
        director.setBuilder(new VisitCardWebsiteBuilder());
        Website website1 = director.buildWebsite();

        Log.i(BuildWebsiteRunner.class.getName(), website1.toString());
        Toast.makeText(BPApplication.getContext(), website1.toString(), Toast.LENGTH_SHORT).show();

        director.setBuilder(new EnterpriceWebsiteBuilder());
        Website website2 = director.buildWebsite();

        Log.i(BuildWebsiteRunner.class.getName(), website2.toString());
        Toast.makeText(BPApplication.getContext(), website2.toString(), Toast.LENGTH_SHORT).show();
    }


}
