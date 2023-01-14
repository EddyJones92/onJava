package Lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMulti {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\eduar\\IdeaProjects\\QA21Selenium\\src\\main\\java\\Lesson6\\dropdown.html");

        Select select = new Select(webDriver.findElement(By.id("cities")));

        select.selectByIndex(0);
        Thread.sleep(2000);

        select.selectByValue("dnepr");
        Thread.sleep(2000);

        select.selectByVisibleText("Kharkov");


    }
}
