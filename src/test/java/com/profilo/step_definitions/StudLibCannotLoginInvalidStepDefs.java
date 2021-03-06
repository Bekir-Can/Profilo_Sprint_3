package com.profilo.step_definitions;

import com.profilo.pages.DashboardPage;
import com.profilo.pages.LoginPage;
import com.profilo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StudLibCannotLoginInvalidStepDefs {

    LoginPage loginPage = new LoginPage();

    @When("the student should not be able to enter invalid credentials {string} {string}")
    public void the_student_should_not_be_able_to_enter_invalid_credentials(String invalidEmail, String invalidPassword) {
        new LoginPage().Email.sendKeys(invalidEmail);
        new LoginPage().password.sendKeys(invalidPassword);

    }

    @When("the librarian should not be able to enter invalid credentials {string} {string}")
    public void the_librarian_should_not_be_able_to_enter_invalid_credentials(String invalidEmail2, String invalidPassword2) {
        new LoginPage().Email.sendKeys(invalidEmail2);
        new LoginPage().password.sendKeys(invalidPassword2);
    }

    @Then("the student and librarian should not be able to log in {string}")
    public void the_student_and_librarian_should_not_be_able_to_log_in(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
    }

}
