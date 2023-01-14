package Lesson6.Lesson9.lesson9.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.function.Function;

public class FindH1 implements Function<WebDriver, WebElement> {
    @Override
    public WebElement apply(WebDriver webDriver) {
        return webDriver.findElement(By.tagName("h1"));
    }
}
