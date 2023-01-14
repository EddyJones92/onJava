package Lesson7.lesson7.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver",
        "C:\\webdrivers\\chromedriver_win32_105.0.5195.52\\chromedriver.exe");
    WebDriver webDriver = new ChromeDriver();

    webDriver.get(
        "C:\\Users\\Evgeniy\\Documents\\QA21Selenium\\src\\main\\java\\lesson7\\alerts.html");

    WebDriver.TargetLocator locator = webDriver.switchTo();
    Alert alert = locator.alert();

    System.out.println("alert = " + alert.getText());
    Thread.sleep(2000);
    System.out.println("alert = " + alert.getText());
    alert.accept();
    Thread.sleep(2000);
    System.out.println("alert = " + alert.getText());
    alert.accept();
    System.out.println("alert = " + alert.getText());
    Thread.sleep(2000);
    alert.sendKeys("Евгений");
    alert.accept();
  }
}
