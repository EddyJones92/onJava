package TestField
        ;

import Core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchEvent;

public class MainPage extends BasePage {
    @FindBy(name = "email")
   private WebElement login;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath = "/html/body/app-root/app-login/section/div/div/form/button")
    private WebElement enterButton;

    @FindBy(xpath = "/html/body/app-root/app-login/section/div/div/form/a")
    private WebElement forgotPassword;

    @FindBy(xpath = "/html/body/app-root/app-login/section/button")
    private WebElement registrationButton;

    @FindBy(xpath = "//*[@id=\"cdk-overlay-13\"]/snack-bar-container")
    private WebElement mistake;

    @FindBy(xpath = "//*[@id=\"mat-input-2\"]")
    private WebElement emailForgot;

    @FindBy(xpath = "/html/body/app-root/app-login/section/div/div/form/mat-form-field[2]/div/div[1]/div/i")
    private WebElement eyeOfPassword;

    public WebElement getEmailForgot() {
        return emailForgot;
    }

    public WebElement getEnterButton() {
        return enterButton;
    }

    public WebElement getEyeOfPassword() {
        return eyeOfPassword;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLogin() {
        return login;
    }

    public WebElement getRegistrationButton() {
        return registrationButton;
    }

    public WebElement getMistake() {
        return mistake;
    }

    public MainPage() {
        webDriver.get("http://ncode-study-v1.0.0.s3-website.us-east-2.amazonaws.com/");
        PageFactory.initElements(webDriver, this);
    }

    public MainPage fillFields(String login, String password) {
        this.login.sendKeys(login);
        this.password.sendKeys(password);
        enterButton.click();
        return this;
    }

    public WebElement getForgotPassword() {
        return forgotPassword;
    }



}
