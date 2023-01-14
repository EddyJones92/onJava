package HW6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\eduar\\IdeaProjects\\QA21Selenium\\src\\main\\java\\HW6\\select_practice.html");

        Select select = new Select(webDriver.findElement(By.id("auto")));

        WebElement output = webDriver.findElement(By.id("out1"));

        select.selectByIndex(1);
        if(output.getText().equals("value:volvo")){
            System.out.println("Success");
        } else
        {
            System.out.println("Wrong");
            System.out.println("must be 'value:volvo'" );
            System.out.println("we have " + output.getText());
        }
        Thread.sleep(1000);

        select.selectByValue("saab");
        if(output.getText().equals("value:saab")){
            System.out.println("Success");
        } else
        {
            System.out.println("Wrong");
            System.out.println("must be 'value:saab'" );
            System.out.println("we have " + output.getText());
        }
        Thread.sleep(1000);
        select.selectByVisibleText("Mercedes");
        if(output.getText().equals("value:mercedes")){
            System.out.println("Success");
        } else
        {
            System.out.println("Wrong");
            System.out.println("must be 'value:mercedes'" );
            System.out.println("we have " + output.getText());
        }
        Thread.sleep(1000);
        select.selectByVisibleText("Audi");
        if(output.getText().equals("value:audio")){
            System.out.println("Success");
        } else
        {
            System.out.println("Something wrong!!!");
            System.out.println("must be: 'value:audio'" );
            System.out.println("we have: " + output.getText());
        }
        Thread.sleep(5000);

        webDriver.quit();
    }

}
