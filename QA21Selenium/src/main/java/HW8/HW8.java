package HW8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HW8 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\eduar\\IdeaProjects\\QA21Selenium\\src\\main\\java\\HW8\\windows.html");

        System.out.println(webDriver.getWindowHandle());

        webDriver.findElement(By.xpath("//*[@id=\"button1\"]")).click();

        Set<String> windowHandles = webDriver.getWindowHandles();

        int count = 1;
        String first = "";
        String second = "";
        for (String windowHandle : windowHandles) {
            if (count == 1) {
                first = windowHandle;
            }
            if (count == 2) {
                second = windowHandle;
            }
            count++;
        }
        System.out.println(second);
        webDriver.switchTo().window(second);
        String title = webDriver.getTitle();
        if (title.equals("Компьютерная Академия ШАГ Днепр – №1 на рынке IT-образования Украины")) {
            System.out.println("Test ok");
        } else {
            System.out.println("Something wrong");
            System.out.println("Must be title: Компьютерная Академия ШАГ Днепр – №1 на рынке IT-образования Украины");
            System.out.println("We have title: " + title);
        }
        webDriver.switchTo().window(first);
        webDriver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/button")).click();

        System.out.println("Все вкладки и окна: " + webDriver.getWindowHandles());

        webDriver.switchTo().window(second);
        webDriver.close();
        webDriver.switchTo().window(first);
        webDriver.close();
        webDriver.quit();

    }
}
