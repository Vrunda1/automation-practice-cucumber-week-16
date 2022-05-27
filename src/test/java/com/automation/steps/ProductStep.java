package com.automation.steps;

import com.automation.pages.Commonpage;
import com.automation.pages.HomePage;
import com.automation.pages.ProductPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import org.junit.Assert;

import java.util.List;

public class ProductStep {
    @And("^I add below product to cart$")
    public void iAddBelowProductToCart(DataTable dataTable) {
        List<List<String>> productList = dataTable.asLists(String.class);



    }
}
