package HW10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HW10 {
    public static void main(String[] args) {
        WebDriverManager.getInstance().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        Actions action = new Actions(webDriver);

        action.contextClick(webDriver.findElement(By.xpath("//*[@class=\"context-menu-one btn btn-neutral\"]")))
                .build()
                .perform();
        action.click(webDriver.findElement(By.xpath("/html/body/ul/li[7]")))
                .build()
                .perform();
        Alert alert = webDriver.switchTo().alert();
        if (alert.getText().equals("clicked: quit")){
        System.out.println("Текст alert = " + alert.getText());
        }
        else {
            System.out.println("Текст не совпадает");
            System.out.println("Должно быть = 'clicked: quit'");
            System.out.println("Мы получаем = " + alert.getText());
        }

        webDriver.quit();
    }
}

