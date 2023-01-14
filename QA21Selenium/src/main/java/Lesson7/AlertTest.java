package Lesson7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\eduar\\IdeaProjects\\QA21Selenium\\src\\main\\java\\Lesson7\\alerts.html");

        WebDriver.TargetLocator locator = webDriver.switchTo();
        Alert alert = locator.alert();

        System.out.println("alert = " + alert.getText());
        Thread.sleep(2000);
        alert.dismiss();
        System.out.println("alert = " + alert.getText());
        Thread.sleep(2000);
        alert.accept();
        alert.sendKeys("<br> My name is Edik");
        Thread.sleep(2000);
        alert.accept();
    }
}
