package lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class FormTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\eduar\\Downloads\\forms.html");

        WebElement login = webDriver.findElement(By.name("login"));
        System.out.println(login.getAttribute("placeholder"));
        login.sendKeys("test text");

        WebElement password = webDriver.findElement(By.name("password"));
        password.sendKeys("111111qq");

        WebElement email = webDriver.findElement(By.name("email"));
        email.sendKeys("jsdg@ksdvf");

        WebElement phone = webDriver.findElement(By.name("phone"));
        phone.sendKeys("+38(099)1234567");

       // phone.submit();

        List<WebElement> inputs = webDriver.findElements(By.tagName("input"));
        List <WebElement> checkboxes = new ArrayList<>();
        for (int i = 0; i < inputs.size(); i++) {
            if (inputs.get(i).getAttribute("type").equals("checkbox"));{
                checkboxes.add(inputs.get(i));
                inputs.get(i).click();
            }
        }


    }
}
