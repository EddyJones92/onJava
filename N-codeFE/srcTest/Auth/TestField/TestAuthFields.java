package TestField;

import Core.WebDriverInit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestAuthFields extends WebDriverInit {

    @Test
    public void checkLoginTutor(){

        String login = "tutor@gmail.com";
        String password = "123456";
        MainPage mainPage = new MainPage();
        mainPage.fillFields(login, password);

    }
    @Test
    public void checkLoginAdmin(){

        String login = "admin@gmail.com";
        String password = "123456";
        MainPage mainPage = new MainPage();
        mainPage.fillFields(login, password);
    }
    @Test
    public void checkLoginStudent(){

        String login = "student@gmail.com";
        String password = "123456";
        MainPage mainPage = new MainPage();
        mainPage.fillFields(login, password);
    }
    @Test
    public void checkLogin2(){
        String login = "tutor@gmail.co";
        String password = "123456";
        MainPage mainPage = new MainPage();
        mainPage.fillFields(login, password);
        Assertions.assertFalse(false);
    }
    @Test
    public void checkLogin3(){
        String login = "tutor@gmail.com";
        String password = "";
        MainPage mainPage = new MainPage();
        mainPage.fillFields(login, password);
        Assertions.assertFalse(false);
    }
    @Test
    public void checkLogin4(){
        String login = "";
        String password = "123456";
        MainPage mainPage = new MainPage();
        mainPage.fillFields(login, password);
        Assertions.assertFalse(false);
    }
    @Test
    public void checkLogin5(){
        String login = "";
        String password = "";
        MainPage mainPage = new MainPage();
        mainPage.fillFields(login, password);
        Assertions.assertFalse(false);
    }
    @Test
    public void eyeCheck (){
        MainPage mainPage = new MainPage();
        mainPage.getPassword().sendKeys("123456");
        mainPage.getEyeOfPassword().click();
        String actual = mainPage.getPassword().getAttribute("type");
        String expected = "text";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void validEmail(){
        MainPage mainPage = new MainPage();
        mainPage.getLogin().sendKeys("123445");
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"mat-form-field-label-1\"]"));
        String actual = element.getText();
        String expected = "Введите валидный e-mail";
        Assert.assertEquals(actual, expected);
    }




}
