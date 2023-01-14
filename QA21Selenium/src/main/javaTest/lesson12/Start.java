package lesson12;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Start {

  @Test
  public void run(){
    WebDriverManager.getInstance().setup();
    WebDriver webDriver = new ChromeDriver();
    GooglePage googlePage = PageFactory.initElements(webDriver, GooglePage.class);
    googlePage.setUrl("https://www.google.com/");
    String expected = "Результатов: примерно";
    String actual = googlePage.getInfo("днепр погода");
    Assertions.assertTrue(actual.contains(expected));
  }


  @Test
  public void testH3(){
    WebDriverManager.getInstance().setup();
    WebDriver webDriver = new ChromeDriver();
    webDriver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
    ItStepBanner banner = PageFactory.initElements(webDriver, ItStepBanner.class);
    banner.setUrl("https://itstep.dp.ua/ru");
    String actual = banner.checkH3();
    String expected = "Хотите получить набор демонстрационных уроков?";
    System.out.println("actual = " + actual);
    System.out.println("expected = " + expected);
  }

}
