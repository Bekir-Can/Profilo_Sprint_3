package com.profilo.step_definitions;

import com.profilo.pages.LoginPage;
import com.profilo.utilities.ConfigurationReader;
import com.profilo.utilities.Driver;
import io.cucumber.java.en.Given;

public class StudentLogoutDefs {

    @Given("Student logged in the application")
    public void student_logged_in_the_application() {
        Driver.get().get(ConfigurationReader.get("url"));
        new LoginPage().login("student46@library", "pOM6YL0B");
    }

}
