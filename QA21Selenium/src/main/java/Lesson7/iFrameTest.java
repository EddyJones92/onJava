package Lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\eduar\\IdeaProjects\\QA21Selenium\\src\\main\\java\\Lesson7\\iframe.html");

        WebElement firstFrame = webDriver.findElement(By.tagName("iframe"));
        WebDriver webDriver1 = webDriver.switchTo().frame(firstFrame);
        System.out.println("h1 = " + webDriver1.findElement(By.tagName("h1")).getText());
        webDriver.switchTo().parentFrame();
        webDriver.switchTo().frame(1);
        System.out.println(webDriver.findElement(By.partialLinkText("Маша и ")).getText());
        System.out.println(webDriver.findElement(By.tagName("a")).getAttribute("href"));

        webDriver.quit();

    }
}
