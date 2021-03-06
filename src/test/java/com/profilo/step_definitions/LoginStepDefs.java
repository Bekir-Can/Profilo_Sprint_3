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
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginStepDefs {


    @When("the user enter valid credentials {string} {string}")
    public void the_User_Enter_Valid_Credentials(String email, String password) {
        Driver.get().get(ConfigurationReader.get("url"));
        new LoginPage().login(email, password);

    }

    @When("the user cannot enter invalid credentials {string} {string}")
    public void theUserCannotEnterInvalidCredentials(String librarian, String passwordd) {
        Driver.get().get(ConfigurationReader.get("url"));
        new LoginPage().login1(librarian, passwordd);

    }

    @When("the user enter invalid credentials {string} {string}")
    public void the_user_enter_invalid_credentials(String InvalidEmail, String InvalidPassword) {
        Driver.get().get(ConfigurationReader.get("url"));
        new LoginPage().login2(InvalidEmail, InvalidPassword);

    }

    @Then("the user can log in")
    public void the_user_can_log_in() {
        //BrowserUtils.waitFor(2);
        Assert.assertEquals("Login - Library", Driver.get().getTitle());

    }

    @Then("the user cannot log in")
    public void the_user_cannot_log_in() {
        BrowserUtils.waitFor(2);
        Assert.assertEquals("https://library3.cybertekschool.com/login.html", Driver.get().getCurrentUrl());

    }


}
