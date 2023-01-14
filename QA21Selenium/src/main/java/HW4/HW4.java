package HW4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class HW4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\Andrey\\IdeaProjects\\QA21Selenium\\src\\main\\java\\DZ4\\automation-practice-table.html");
        String [] titles = {"Бурдж-Халифа", "Абрадж аль-Бейт","Тайбэй таун", "Шанхайский всемирный финансовый центр" };
        String [] refs = {"https://ru.wikipedia.org/wiki/%D0%91%D1%83%D1%80%D0%B4%D0%B6-%D0%A5%D0%B0%D0%BB%D0%B8%D1%84%D0%B0",
        "https://ru.wikipedia.org/wiki/%D0%90%D0%B1%D1%80%D0%B0%D0%B4%D0%B6_%D0%B0%D0%BB%D1%8C-%D0%91%D0%B5%D0%B9%D1%82",
        "https://ru.wikipedia.org/wiki/%D0%A2%D0%B0%D0%B9%D0%B1%D1%8D%D0%B9_101",
        "https://ru.wikipedia.org/wiki/%D0%A8%D0%B0%D0%BD%D1%85%D0%B0%D0%B9%D1%81%D0%BA%D0%B8%D0%B9_%D0%B2%D1%81%D0%B5" +
                "%D0%BC%D0%B8%D1%80%D0%BD%D1%8B%D0%B9_%D1%84%D0%B8%D0%BD%D0%B0%D0%BD%D1%81%D0%BE%D0%B2%D1%8B%D0%B9_%D" +
                "1%86%D0%B5%D0%BD%D1%82%D1%80"};
        List <String> stringList = new ArrayList<>(Arrays.asList(refs));
        for (int i = 0; i < stringList.size(); i++) {
            webDriver.get(stringList.get(i));
            WebElement webElement = webDriver.findElement(By.tagName("h1"));
            String text = webElement.getText();
            for (int j = 0; j < titles.length; j++) {
                if (i == j){
                    if (text.equals(titles[i])){
                        System.out.println("Test " + (j+1) + " Ok");
                    }
                    else {
                        System.out.println("Ошибка " + (j+1));
                        System.out.println("Должно быть: " + titles[j]);
                        System.out.println("Как есть: " + text);
                    }
                }
            }
            webDriver.navigate().back();
        }
        webDriver.quit();
    }
}
