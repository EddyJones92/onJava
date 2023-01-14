package Lesson6.Lesson9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class Waits {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\eduar\\IdeaProjects\\QA21Selenium\\src\\main\\java\\Lesson9\\waits.html");

        webDriver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));

        System.out.println(webDriver.findElement(By.tagName("h1")).getText());

        // явные ожидания

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofMinutes(10));
        wait.until(new Function<WebDriver, Alert>() {

            @Override
            public Alert apply(WebDriver webDriver) {
                return webDriver.switchTo().alert();
            }
        });

        webDriver.switchTo().alert().accept();



    }
}
