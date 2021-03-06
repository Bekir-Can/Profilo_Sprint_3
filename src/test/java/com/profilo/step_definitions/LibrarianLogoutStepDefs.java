package com.profilo.step_definitions;

import com.profilo.pages.DashboardPage;
import com.profilo.pages.LoginPage;
import com.profilo.utilities.BrowserUtils;
import com.profilo.utilities.ConfigurationReader;
import com.profilo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LibrarianLogoutStepDefs {
    DashboardPage dashboardPage = new DashboardPage();

    @Given("the librarian logged in the application")
    public void the_librarian_logged_in_the_application() {
        Driver.get().get(ConfigurationReader.get("url"));
        new LoginPage().login("librarian26@library", "gFOHHm6H");

    }


    @When("the user should be able to click the user name button")
    public void the_user_should_be_able_to_click_the_user_name_button() {

        dashboardPage.userLogOutButton.click();


    }


    @When("the user click the log out button")
    public void the_user_click_the_log_out_button() {
        BrowserUtils.waitFor(2);
        dashboardPage.logOutButton.click();

    }

    @Then("log out page title should be {string}")
    public void log_out_page_title_should_be(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
    }


}
