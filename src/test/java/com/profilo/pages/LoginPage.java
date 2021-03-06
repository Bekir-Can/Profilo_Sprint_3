package com.profilo.pages;

import com.profilo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="inputEmail")
    public WebElement Email;



    @FindBy(id="inputPassword")
    public WebElement password;

    @FindBy(tagName = "button")
    public WebElement loginButton;



    public void login(String userNameStr, String passwordStr) {
        Email.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        loginButton.click();

    }
    public void login1(String librarian, String passwordd) {
        Email.sendKeys(librarian);
        password.sendKeys(passwordd);
        loginButton.click();
}
    public void login2(String InvalidEmail, String InvalidPassword) {
        Email.sendKeys(InvalidEmail);
        password.sendKeys(InvalidPassword);
        loginButton.click();
    }
    public void preLogIn(String librarianEmail, String librarianPassword){
        Email.sendKeys(librarianEmail);
        password.sendKeys(librarianPassword);
        loginButton.click();




    }

}