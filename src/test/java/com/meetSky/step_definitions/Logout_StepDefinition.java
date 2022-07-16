package com.meetSky.step_definitions;

import com.meetSky.pages.BasePage;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.bouncycastle.jcajce.provider.symmetric.IDEA;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;

public class Logout_StepDefinition {
    BasePage page=new BasePage();
    @When("Click on the profile icon")
    public void click_on_the_profile_icon() {
      page.profileIcon.click();

    }
    @When("Verify that user can see and click the Log out link")
    public void verify_that_user_can_see_and_click_the_log_out_link() {
        page.logoutIcon.click();
    }
    @Then("Verify that user can log out on the files page and see log in page")
    public void verify_that_user_can_log_out_on_the_files_page_and_see_log_in_page() {
        Assert.assertTrue( page.loginButton.isDisplayed());

    }

    @And("Click on the step back button")
    public void clickOnTheStepBackButton() {
        Driver.getDriver().navigate().back();
    }

    @Then("Verify that user can NOT go to home page again")
    public void verifyThatUserCanNOTGoToHomePageAgain()  {

        try {
            //assertFalse method will pass the test if the boolean value returned is: false
            Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
           Assert.assertFalse(page.filesIcon.isDisplayed());
        }catch (NoSuchElementException n){
            Assert.assertTrue(true);
        }
    }
}
