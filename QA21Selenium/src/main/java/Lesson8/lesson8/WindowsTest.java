package Lesson8.lesson8;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsTest {
  public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver",
        "C:\\webdrivers\\chromedriver_win32_105.0.5195.52\\chromedriver.exe");
    WebDriver webDriver = new ChromeDriver();
    String url = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe";

    webDriver.get(url);

    webDriver.findElement(By.id("tryhome")).click();

    System.out.println("first = "+ webDriver.getWindowHandle());
    System.out.println("title = "+ webDriver.getTitle());

    Set<String> allWindows = webDriver.getWindowHandles();
    int count = 1;

    String secondWindow = "";
    for (String allWindow : allWindows) {
      if(count == 2){
        secondWindow = allWindow;
      }
      count++;
    }

    System.out.println("second = " + secondWindow);

    webDriver.switchTo().window(secondWindow);

    System.out.println("title = "+ webDriver.getTitle());


  }
}
