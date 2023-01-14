package Lesson4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebElementTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("C:\\Users\\eduar\\IdeaProjects\\QA21Selenium\\src\\main\\java\\Lesson4\\index.html");

        WebElement element = webDriver.findElement(By.tagName("h1"));


        System.out.println("getText = " + element.getText());
        System.out.println("element.getTagName() = " + element.getTagName());
        System.out.println("element.getSize().height = " + element.getSize().height);
        System.out.println("element.getSize().width = " + element.getSize().width);
        System.out.println("element.isDisplayed() = " + element.isDisplayed());

      //  WebElement itStep = webDriver.findElement(By.linkText("ITStep Dnipro")); // для полного ввода названия ссылки
        WebElement itStep = webDriver.findElement(By.partialLinkText("ITStep Dnipro")); //для неполного
        System.out.println("element1.getText() = " + itStep.getText());
        itStep.click(); // переход на новыю страницу

        webDriver.navigate().back();
        Thread.sleep(2000);

        List<WebElement> elements = webDriver.findElements(By.tagName("li"));

        webDriver.quit();

    }
}
