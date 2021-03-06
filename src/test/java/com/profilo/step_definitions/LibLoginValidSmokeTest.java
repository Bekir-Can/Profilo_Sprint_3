package com.profilo.step_definitions;

import com.profilo.pages.DashboardPage;
import com.profilo.pages.LoginPage;
import com.profilo.utilities.BrowserUtils;
import com.profilo.utilities.ConfigurationReader;
import com.profilo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LibLoginValidSmokeTest {

    LoginPage login = new LoginPage();

    @Given("the librarian should be able to login page {string}")
    public void the_librarian_should_be_able_to_login_page(String browser) {
        Driver.get().get(browser);
    }

    @When("the librarian should be able to enter valid credentials {string} {string}")
    public void the_librarian_should_be_able_to_enter_valid_credentials(String email, String password) {
        new LoginPage().Email.sendKeys(email);
        new LoginPage().password.sendKeys(password);
    }

    @Then("the librarian should be able to click sign in button")
    public void the_librarian_should_be_able_to_click_sign_in_button() {

        new LoginPage().loginButton.click();
    }

    @Then("the librarian should be able to log out")
    public void the_librarian_should_be_able_to_log_out() {
        BrowserUtils.waitFor(2);
        new DashboardPage().userLogOutButton.click();
        new DashboardPage().logOutButton.click();
    }

}