package Lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectText {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\eduar\\IdeaProjects\\QA21Selenium\\src\\main\\java\\Lesson6\\dropdown.html");

        Select select = new Select(webDriver.findElement(By.id("post")));

       // WebElement firstSelectedOption = select.getFirstSelectedOption();
        // System.out.println("selected" + firstSelectedOption);

        List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
        for (WebElement allSelectedOption : allSelectedOptions) {
            System.out.println("allSelectedOptions = " + allSelectedOptions);
        }


        Thread.sleep(2000);
        select.selectByVisibleText("2");
        Thread.sleep(2000);
        select.selectByValue("First");
        Thread.sleep(2000);
        select.selectByIndex(3);
        select.deselectByIndex(3);


    }
}
