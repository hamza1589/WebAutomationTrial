package com.ebay.data;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "searchData")
    public Object [] getSearchData(){

      return new Object[] {"Core Java Books","Selenium Books","Data Structure Books"};
    }
    @DataProvider(name = "credentials")
    public Object[][] getCredtials(){
        return new Object[][]{{"hamzacherfaoui88@yahoo.com","test123"},{"hamzacherfaoui84@yahoo.com","test173"},{"hamzacherfaoui87@yahoo.com","test143"}};
    }
}
