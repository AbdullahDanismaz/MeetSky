package com.meetSky.step_definitions;

import com.meetSky.pages.BasePage;
import com.meetSky.utilities.BrowserUtils;
import com.meetSky.utilities.ConfigurationReader;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Login_step_definition {
        BasePage page=new BasePage();
    @Given("Navigate to login page")
    public void navigate_to_login_page() {
       Driver.getDriver().get(ConfigurationReader.getProperty("meetSky_url"));
    }

    @When("Enter username into {string} inputBox")
    public void enter_username_into_input_box(String username) {
       page.usernameInputBox.sendKeys(username);
    }

    @When("Enter password into {string} inputBox")
    public void enter_password_into_input_box(String password) {
         page.passwordInputBox.sendKeys(password);
    }

    @When("Click on the login button on the login page")
    public void click_on_the_login_button_on_the_login_page() {
          page.loginButton.click();
    }

    @Then("Verify that user can login files page successfully")
    public void verify_that_user_can_login_files_page_successfully() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(page.filesIcon.isEnabled());

    }


    @Then("Verify that user can not login and see the notice message")
    public void verifyThatUserCanNotLoginAndSeeTheNoticeMessage() {
        Assert.assertEquals(page.wrongPasswordMsg.getText(),"Wrong username or password.");
    }

    @Then("Verify that user can not login and see the fill in this field message")
    public void verifyThatUserCanNotLoginAndSeeTheFillInThisFieldMessage() throws InterruptedException {

        String message = Driver.getDriver().findElement(By.name("user")).getAttribute("validationMessage");

        Assert.assertTrue(message.equalsIgnoreCase("Please fill in this field."));
        System.out.println("message = " + message);
    }
    @Then("Verify that user can see the password in a form of dots by default")
    public void verifyThatUserCanSeeThePasswordInAFormOfDotsByDefault() {
        boolean isEncrypted = page.passwordInputBox.getAttribute("type").equals("password");
        Assert.assertTrue(isEncrypted);
    }
    @And("Click on the eye sign after entering the password")
    public void clickOnTheEyeSignAfterEnteringThePassword() {
        page.togglePassword.click();
    }

    @Then("Verify that user can see the password explicitly")
    public void verifyThatUserCanSeeThePasswordExplicitly() {
     String password= page.passwordInputBox.getAttribute("type");
     Assert.assertTrue(password.equalsIgnoreCase("text"));
    }


    @Then("Verify that user can see the {string} button")
    public void verifyThatUserCanSeeTheButton(String arg0) {
        Assert.assertEquals(page.forgotPassword.getText(),"Forgot password?");

    }

    @And("Click on the {string} button")
    public void clickOnTheButton(String arg0) {
        page.forgotPassword.click();
    }

    @Then("Verify that user could see the {string} button")
    public void verifyThatUserCouldSeeTheButton(String arg0) {
        page.resetPasswordButton.isDisplayed();
    }

    @When("Verify that user can see valid placeholders on Username inputBox")
    public void verifyThatUserCanSeeValidPlaceholdersOnUsernameInputBox() {
      Assert.assertEquals(page.usernameInputBox.getAttribute("placeholder"),"Username or email");
    }

    @When("Verify that user can see valid placeholders on Password inputbox")
    public void verifyThatUserCanSeeValidPlaceholdersOnPasswordInputbox() {
        Assert.assertEquals(page.passwordInputBox.getAttribute("placeholder"),"Password");
    }

    @Then("Verify that user can not login with valid username and blank password")
    public void verifyThatUserCanNotLoginWithValidUsernameAndBlankPassword() {
        String message = Driver.getDriver().findElement(By.name("password")).getAttribute("validationMessage");

        Assert.assertTrue(message.equalsIgnoreCase("Please fill in this field."));
        System.out.println("message = " + message);
    }
}


