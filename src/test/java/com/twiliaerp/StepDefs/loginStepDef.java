package com.twiliaerp.StepDefs;

import com.twiliaerp.pages.LoginPage;
import com.twiliaerp.utilities.BrowserUtils;
import com.twiliaerp.utilities.ConfigurationReader;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class loginStepDef {
    LoginPage loginPage=new LoginPage();

    @Given("the user should be on the login page")
    public void the_user_should_be_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user enters credentials with {string} {string}")
    public void the_user_enters_credentials_with(String user, String password) {
    loginPage.login(user,password);
        BrowserUtils.waitForPageToLoad(5);
    }

    @Then("the user should be able login page {string}")
    public void the_user_should_be_able_login_page(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("the user shouldn`t be able to login")
    public void theUserShouldnTBeAbleToLogin() {
     String expectedError="Wrong login/password";
     String actualError=loginPage.errorMessage.getText();
     Assert.assertEquals(expectedError,actualError);
    }

    @When("navigate{string}")
    public void navigate(String string) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.navigateModule(string).click();
    }

    @Then("click and hold")
    public void click_and_hold() throws InterruptedException {
        Actions actions=new Actions(Driver.get());
        Thread.sleep(5000);
        //actions.moveToElement(loginPage.t_shirt).clickAndHold().moveToElement(loginPage.target).release().build().perform();
        actions.dragAndDrop(loginPage.t_shirt,loginPage.target).perform();


    }

}
