package Lesson6.Lesson9.lesson9.waits;

import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitlyWaitTest {

  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver",
        "C:\\webdrivers\\chromedriver_win32_105.0.5195.52\\chromedriver.exe");
    WebDriver webDriver = new ChromeDriver();

    webDriver.get(
        "C:\\Users\\Evgeniy\\Documents\\QA21Selenium\\src\\main\\java\\lesson9\\waits\\waits.html");

    //неявные ожидания
    webDriver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));
    webDriver.manage().timeouts().getImplicitWaitTimeout();

    System.out.println(webDriver.findElement(By.tagName("h1")).getText());

    //явные ожидания
    WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofMinutes(30));

    wait.until(new Function<WebDriver, Alert>() {
      @Override
      public Alert apply(WebDriver webDriver) {
        return webDriver.switchTo().alert();
      }
    });
  }
}
