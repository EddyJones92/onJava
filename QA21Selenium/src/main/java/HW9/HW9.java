package HW9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.function.Function;

public class HW9 {
    public static void main(String[] args) {
        WebDriverManager.getInstance().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\eduar\\IdeaProjects\\QA21Selenium\\src\\main\\java\\HW9\\waits.html");

        FluentWait<WebDriver> wait = new FluentWait<>(webDriver);
        wait.withTimeout(Duration.ofMinutes(10));
        wait.pollingEvery(Duration.ofSeconds(1));//каждую секунду проверяем
        wait.ignoring(NoSuchElementException.class);//рефлексия
        wait.ignoring(NoAlertPresentException.class);//рефлексия
        WebElement h1 = wait.until(new FindH1());
        System.out.println("h1 = " + h1.getText());

        Alert alert = wait.until(new Function<WebDriver, Alert>() {
            @Override
            public Alert apply(WebDriver webDriver) {
                return webDriver.switchTo().alert();
            }
        });
        System.out.println("alert.getText() = " + alert.getText());
        alert.accept();

        String classOfBody = wait.until(new Function<WebDriver, String>() {

            @Override
            public String apply(WebDriver webDriver) {
                return webDriver.findElement(By.tagName("body")).getAttribute("class");
            }
        });

        //    String classOfBody = wait.until(new FindClass());
        if (classOfBody.equals("blue")) {
            System.out.println(classOfBody);
        } else {
            System.out.println("There is no class 'blue'.");
        }
    }

    static class FindH1 implements Function<WebDriver, WebElement> {
        @Override
        public WebElement apply(WebDriver webDriver) {
            return webDriver.findElement(By.tagName("h1"));
        }
    }
    // static class FindClass implements Function<WebDriver, String> {
//
    //     @Override
    //     public String apply(WebDriver webDriver) {
    //         return webDriver.findElement(By.tagName("body")).getAttribute("class");
    //     }
    // }
}
