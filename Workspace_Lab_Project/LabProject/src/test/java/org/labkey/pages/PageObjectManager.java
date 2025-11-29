package org.labkey.pages;

import org.labkey.utility.TestContextSetup;

public class PageObjectManager {

    private TestContextSetup testContextSetup;

    private HomePage homePage;
    public PageObjectManager(TestContextSetup testContextSetup){
        this.testContextSetup=testContextSetup;

    }

    public HomePage homePage(){
        if(homePage == null){
            homePage=new HomePage(testContextSetup);
        }
        return homePage;
    }



}
