package DZ11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DZ11 {
    public static void main(String[] args) {
        WebDriverManager.getInstance().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://shop.demoqa.com/shop/");

        Select select = new Select(webDriver.findElement(By.name("orderby")));
        select.selectByValue("popularity");
        WebElement link1 = webDriver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[4]/div/span[1]/a"));
        link1.click();

        List<WebElement> shoes = webDriver.findElements(By.className("posted_in"));

        for (int i = 0; i < shoes.size(); i++) {
            WebElement a = shoes.get(i).findElement(By.tagName("a"));
            if (a.getText().equals("Shoes")) {
                System.out.println("Ok");
            } else {
                System.out.println("False");
                System.out.println("Группа товаров не совпадает с 'Shoes'");
                System.out.println("Товар относится к группе " + a.getText());
            }
        }
        WebElement find2 = webDriver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[5]/div/h3/a"));
        find2.click();
        System.out.println("Title = " + webDriver.getTitle());
        String title = "rose gold simple strap platform sandals – ToolsQA Demo Site";
        if (webDriver.getTitle().equals(title)){
            System.out.println("Title Ok");
        }else{
            System.out.println("Неправельный Title ");
            System.out.println("Должен быть " + title);
            System.out.println("У нас " + webDriver.getTitle());
        }
        System.out.println("============================================================");
        webDriver.navigate().back();
        webDriver.navigate().back();

        webDriver.findElement(By.className("noo-search")).click();
        WebElement s = webDriver.findElement(By.name("s"));
        s.sendKeys("Sun Glasses");
        s.submit();

        List<WebElement> glasses = webDriver.findElements(By.className("posted_in"));

        for (int i = 0; i < glasses.size(); i++) {
            WebElement a = glasses.get(i).findElement(By.tagName("a"));
            if (a.getText().equals("Sun Glasses")) {
                System.out.println("Ok");
            } else {
                System.out.println("False");
                System.out.println("Группа товаров не совпадает с 'Sun Glasses'");
                System.out.println("Товар относится к группе " + a.getText());
            }
        }
        WebElement find3 = webDriver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[4]/div/h3/a"));
        find3.click();

        System.out.println(webDriver.findElement(By.xpath("//*[@id=\"product-1323\"]/div[1]/div[2]/p/ins/span/bdi")).getText());
        WebElement sum = webDriver.findElement(By.xpath("//*[@id=\"product-1323\"]/div[1]/div[2]/p/ins/span/bdi"));
        if (sum.getText().equals("₹55.00")){
            System.out.println("Sum ok");
        }else {
            System.out.println("Неправильная цена");
            System.out.println("Должна быть ₹55.00");
            System.out.println("На сайте " + sum);
        }

    }
}
