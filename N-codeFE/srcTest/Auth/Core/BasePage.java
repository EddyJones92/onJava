package Core;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected static WebDriver webDriver;
    public static void setDriver (WebDriver driver) {
        webDriver = driver;
    }

}
