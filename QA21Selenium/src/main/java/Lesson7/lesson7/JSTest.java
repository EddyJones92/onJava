package Lesson7.lesson7;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSTest {

  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver",
        "C:\\webdrivers\\chromedriver_win32_105.0.5195.52\\chromedriver.exe");
    WebDriver webDriver = new ChromeDriver();
    webDriver.get("C:\\Users\\Evgeniy\\Documents\\QA21Selenium\\src\\main\\java\\lesson7\\iframe\\iframe.html");
    JavascriptExecutor webDriver1 = (JavascriptExecutor) webDriver;
    webDriver1.executeAsyncScript("alert('Hello from Java')");
    webDriver1.executeAsyncScript("document.write('<h1>Hello from Java</h1>')");

  }
}
