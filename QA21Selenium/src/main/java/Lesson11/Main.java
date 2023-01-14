package Lesson11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Main {
  public static void main(String[] args) {
    WebDriverManager.getInstance().setup();
    WebDriver webDriver = new ChromeDriver();
    //GooglePage googlePage = new GooglePage(webDriver);
    //нужен для @FindElement
    GooglePage googlePage = PageFactory.initElements(webDriver, GooglePage.class);
    googlePage.setUrl("https://www.google.com/");
    String expected = "Результатов: примерно 5 800 000";
    String actual = googlePage.getInfo("днепр погода");
    System.out.println(actual.contains(expected));
    webDriver.quit();
  }
}
