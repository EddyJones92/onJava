package HW5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class HW5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("C:\\Users\\eduar\\IdeaProjects\\QA21Selenium\\src\\main\\java\\HW5\\hw5.html");

        List<WebElement> inputs = webDriver.findElements(By.tagName("input"));

        for (int i = 0; i < inputs.size(); i++) {
            System.out.println("type = " + inputs.get(i).getAttribute("type"));
        }
        System.out.println("Количество чекбоксов и радио = " + inputs.size());

      //  for (int i = 0; i < inputs.size(); i++) {
      //      if (inputs.get(i).getAttribute("type").equals("checkbox")) {
      //          inputs.get(i).click();
      //        //  Thread.sleep(1000);
      //      }
//
      //      if (inputs.get(i).getAttribute("type").equals("radio")) {
      //          inputs.get(i).click();
      //       //   Thread.sleep(1000);
//
      //      }
      //  }

        for (int i = 0; i < inputs.size(); i++) {
            inputs.get(i).click();
        }

        for (int i = 0; i < inputs.size(); i++) {
            if(inputs.get(i).getAttribute("type").equals("checkbox")){
                if (inputs.get(i).isSelected()){
                    System.out.println("Checked " + inputs.get(i).getAttribute("value"));
                }
            }
            if (inputs.get(i).getAttribute("type").equals("radio")) {
                if (inputs.get(i).isSelected()){
                    System.out.println("Checked " + inputs.get(i).getAttribute("value"));
                }
            }
        }

        webDriver.quit();

    }
}
