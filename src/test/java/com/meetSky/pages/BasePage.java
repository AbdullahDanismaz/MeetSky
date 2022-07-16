package com.meetSky.pages;

import com.meetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='user']")
    public WebElement usernameInputBox;


    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginButton;

    @FindBy (xpath = "//a[@href='/index.php/apps/files/']")
    public WebElement filesIcon;
    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement wrongPasswordMsg;

    @FindBy (xpath =" //img[@width='32']")
    public WebElement profileIcon;

    @FindBy (xpath =  "//li[@data-id='logout']")
    public WebElement logoutIcon;

    @FindBy(xpath = "//a[@id='lost-password']")

    public WebElement forgotPassword;

    @FindBy(xpath = "//a[@class='toggle-password']")

    public WebElement togglePassword;

    @FindBy(xpath = "//input[@id='reset-password-submit']")
    public WebElement resetPasswordButton;


}
