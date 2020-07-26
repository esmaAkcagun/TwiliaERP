package com.twiliaerp.pages;

import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    @FindBy(css = ".oe_kanban_content")
    public WebElement t_shirt;

    @FindBy(xpath = "//div[@data-id=2]")
    public WebElement target;


    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public WebElement navigateModule(String module){
        String xpath= "//div[@class='navbar-collapse collapse']/ul/li//span[contains(text(),'"+module+"')]";
        return Driver.get().findElement(By.xpath(xpath));
    }
}
