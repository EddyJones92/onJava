import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {
    @Test
    void actionsTest() {
        WebDriverManager.getInstance().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\eduar\\IdeaProjects\\QA21Selenium\\src\\main\\java\\Lesson10\\actions.html");

        Actions actions = new Actions(webDriver);
        actions
                .click(webDriver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]")))
                .keyDown(Keys.CONTROL)
                .click(webDriver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]")))
                .click(webDriver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]")))
                .perform();
        actions
                .clickAndHold(webDriver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]")))
                .moveToElement(webDriver.findElement(By.xpath("//*[@id=\"selectable\"]/li[10]")))
                .perform();
    }

    @Test
    void actionsTest1() {
        WebDriverManager.getInstance().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://thedeepestsite.com/ua/");

        webDriver.manage().window().maximize();


        Actions actions = new Actions(webDriver);
        actions
                .click(webDriver.findElement(By.xpath("")))
                .scrollByAmount(0, 1000);

    }
}
