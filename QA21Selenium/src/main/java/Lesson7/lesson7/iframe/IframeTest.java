package Lesson7.lesson7.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTest {

  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver",
        "C:\\webdrivers\\chromedriver_win32_105.0.5195.52\\chromedriver.exe");
    WebDriver webDriver = new ChromeDriver();

    webDriver.get("C:\\Users\\Evgeniy\\Documents\\QA21Selenium\\src\\main\\java\\lesson7\\iframe.html");

    WebElement firstFrame = webDriver.findElement(By.tagName("iframe"));

    WebDriver webDriver1 = webDriver.switchTo().frame(firstFrame);//webDriver1 - это драйвер внутренней страницы
    System.out.println(webDriver1.findElement(By.tagName("h1")).getText());//мы внутри inner page
    System.out.println("webDriver.getTitle() = " + webDriver1.getTitle());
    webDriver.switchTo().parentFrame();//возвращаемся на главную страницу
    webDriver.switchTo().frame(1);//переключаемся на you tube
    System.out.println(webDriver.findElement(By.partialLinkText("Маша")).getText());

    webDriver.quit();
  }
}
