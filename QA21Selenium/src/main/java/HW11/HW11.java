package HW11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HW11 {
    public static void main(String[] args) {
        WebDriverManager.getInstance().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://shop.demoqa.com/shop/");

        webDriver.manage().window().maximize();

        webDriver.findElement(By.name("orderby"))
                .click();
        webDriver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[1]/div/form/select/option[2]"))
                .click();
        webDriver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[4]/div/span[1]/a"))
                .click();

        List<WebElement> searchShoes = webDriver.findElements(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div/div"));
        String shoesCategory = "Shoes";

        for (int i = 0; i < searchShoes.size(); i++) {
            WebElement a = searchShoes.get(i).findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[1]/div/span/a"));
            if (a.getText().equals(shoesCategory)) {
                System.out.println("Category's name - Shoes");
            } else {
                System.out.println("Category's name - not Shoes");
                System.out.println("It is" + a.getText());
            }
        }

        webDriver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[5]/div/h3/a")).click();

        String titleActual = webDriver.getTitle();
        String titleExpected = "rose gold simple strap platform sandals – ToolsQA Demo Site";

        if (titleActual.equals(titleExpected)){
            System.out.println("Title is ok");
        }else {
            System.out.println("We get " + titleActual);
            System.out.println("Must be" + titleExpected);
        }
        webDriver.navigate().back();
        webDriver.navigate().back();

        Actions action = new Actions(webDriver);
        action.moveToElement(webDriver.findElement(By.xpath("//*[@id=\"noo-site\"]/header/div[2]/div/div/div/a")))
                .click()
                .sendKeys("Sun Glasses")
                .keyDown(Keys.ENTER)
                .build()
                .perform();

        List<WebElement> sunGlassesSearch = webDriver.findElements(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div/div"));
        String sunGlassesCategory = "Sun Glasses";
        for (int i = 0; i < sunGlassesSearch.size(); i++) {
            WebElement a = sunGlassesSearch.get(i).findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div/div/span[1]/a"));
            if (a.getText().equals(sunGlassesCategory)) {
                System.out.println("Category's name - Sun Glasses");
            } else {
                System.out.println("Category's name - not Sun Glasses");
                System.out.println("It is" + a.getText());
            }
        }

        webDriver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[4]/div/h3/a"))
                .click();

        WebElement actualPrice = webDriver.findElement(By.xpath("//*[@id=\"product-1323\"]/div[1]/div[2]/p/ins/span/bdi"));
        WebElement oldPrice = webDriver.findElement(By.xpath("//*[@id=\"product-1323\"]/div[1]/div[2]/p/del"));

        if (!actualPrice.getText().equals(oldPrice.getText())){
            if (actualPrice.getText().equals("₹55.00")){
                System.out.println("Right price");
            }
            else if (actualPrice.getText().equals("₹60.00")){
                System.out.println("Wrong price");
                System.out.println("Must be = " + actualPrice);
                System.out.println("We have = " + oldPrice);
            } else {
                System.out.println("Wrong price");
                System.out.println("Must be = " + actualPrice);
            }
        }
        webDriver.quit();

    }
}
