package com.twiliaerp.pages;

import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = "#login")
    public WebElement userInput;

    @FindBy(css = "#password")
    public WebElement password;

    @FindBy(css = ".btn.btn-primary")
    public WebElement submit;

    @FindBy(xpath = "//p")
    public WebElement errorMessage;

   public void login(String user,String pass){
       userInput.sendKeys(user);
       password.sendKeys(pass);
       submit.click();

   }

}
