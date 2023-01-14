package Lesson6.Lesson9.lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hw {

  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver",
        "C:\\webdrivers\\chromedriver_win32_105.0.5195.52\\chromedriver.exe");
    WebDriver webDriver = new ChromeDriver();
    webDriver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");

    WebElement frame = webDriver.findElement(By.id("iframeResult"));

    WebDriver webDriver1 = webDriver.switchTo().frame(frame);
    System.out.println(webDriver1.findElement(By.tagName("h1")).getText());


    WebDriver webDriver2 = webDriver1.switchTo().frame(0);
    System.out.println(webDriver2.findElement(By.tagName("h1")).getText());

    System.out.println(webDriver2.getPageSource());
    String pageSource = webDriver2.getPageSource();
    int index1 = pageSource.indexOf("<title>");
    int index2 = pageSource.indexOf("</title>");
    webDriver.quit();
  }
}


