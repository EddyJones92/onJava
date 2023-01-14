package HW7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW7 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.getInstance().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");

        WebElement frame = webDriver.findElement(By.id("iframeResult"));
        WebDriver webDriver1 = webDriver.switchTo().frame(frame);
        WebElement frame2 = webDriver1.findElement(By.tagName("iframe"));
        WebDriver webDriver2 = webDriver1.switchTo().frame(0);

        String pageSource = webDriver.getPageSource();
        String start = "<title>";
        String end = "</title>";

        int indexStart = pageSource.indexOf(start);
        int indexEnd = pageSource.indexOf(end);
        String title = pageSource.substring(indexStart + start.length(), indexEnd);

        System.out.println(title);

        System.out.println("========================================================");

        webDriver.get("C:\\Users\\eduar\\IdeaProjects\\QA21Selenium\\src\\main\\java\\HW7\\alert.html");

        WebElement button = webDriver.findElement(By.tagName("button"));
        button.click();
        Thread.sleep(2000);

        Alert alert = webDriver.switchTo().alert();
        alert.accept();

        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"alert\"]/span"));

        if (element.getText().equals("+")){
            System.out.println("Element '+' is detected");
        } else {
            System.out.println("There is no element '+'");
        }

        webDriver.quit();
    }
}
