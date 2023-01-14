package TestField;

import Core.WebDriverInit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ForgottenPasswordTest extends WebDriverInit {

    @Test
    public void checkForgotUrl(){
        MainPage mainPage = new MainPage();
        mainPage.getForgotPassword().click();
        mainPage.getEmailForgot().sendKeys("tutor@gmail.com");
        String actual = webDriver.getCurrentUrl();
        String expected = "http://ncode-study-v1.0.0.s3-website.us-east-2.amazonaws.com/forgot-password";
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void buttonResetCheck(){
        MainPage mainPage = new MainPage();
        mainPage.getForgotPassword()
                .click();
        mainPage.getEmailForgot()
                .sendKeys("");
        WebElement button = webDriver
                .findElement(By.xpath("/html/body/app-root/app-forgot-password/section/div/form/button"));
        String actual = button.getAttribute("class");
        String expected = "pass-form__btn button__disabled";
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void sendEmail(){
        MainPage mainPage = new MainPage();
        mainPage.getForgotPassword()
                .click();
        mainPage.getEmailForgot().sendKeys("tutor@gmail.com");
        WebElement button = webDriver
                .findElement(By.xpath("/html/body/app-root/app-forgot-password/section/div/form/button"));
        button.click();
        mainPage.getEnterButton().click();
        String actual = webDriver.getCurrentUrl();
        String expected = "http://ncode-study-v1.0.0.s3-website.us-east-2.amazonaws.com/?accessDenied=true";
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void validEmail(){
        MainPage mainPage = new MainPage();
        mainPage.getForgotPassword()
                .click();
        mainPage.getEmailForgot().sendKeys("ввелмейл");
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"mat-form-field-label-5\"]"));
        String actual = element.getText();
        String expected = "Введите валидный e-mail";
        Assert.assertEquals(actual, expected);

    }




}
