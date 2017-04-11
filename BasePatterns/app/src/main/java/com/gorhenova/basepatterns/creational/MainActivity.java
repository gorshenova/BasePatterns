package com.gorhenova.basepatterns.creational;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.gorhenova.basepatterns.R;
import com.gorhenova.basepatterns.creational.abstractfactory.AuctionSiteProject;
import com.gorhenova.basepatterns.creational.abstractfactory.SuperBankSystem;
import com.gorhenova.basepatterns.creational.builder.BuildWebsiteRunner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_pattern_builder).setOnClickListener(this);
        findViewById(R.id.btn_pattern_abstract_factory).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_pattern_builder){
            openBuilderView();
        } else if(v.getId() == R.id.btn_pattern_abstract_factory){
            openAbstractFactoryView();
        }
    }

    private void openAbstractFactoryView() {
        AuctionSiteProject auctionSiteProject = new AuctionSiteProject();
        auctionSiteProject.create();

        SuperBankSystem superBankSystem =  new SuperBankSystem();
        superBankSystem.create();
    }

    private void openBuilderView() {
        BuildWebsiteRunner client = new BuildWebsiteRunner();
        client.start();
    }
}
