package Lesson3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.google.com/");

        System.out.println(webDriver.getTitle());
        System.out.println("webDriver.getCurrentUrl() = " + webDriver.getCurrentUrl());

      //  BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("google.txt"));

        String pageSourse = webDriver.getPageSource();

        BufferedWriter writer = new BufferedWriter(new FileWriter("google.html"));
        writer.write(pageSourse);

       // System.out.println("webDriver.getPageSource() = " + webDriver.getPageSource());
        webDriver.quit();

    }
}
