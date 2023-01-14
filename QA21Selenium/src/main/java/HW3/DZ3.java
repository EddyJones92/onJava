package HW3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DZ3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        String[] url = {"https://rozetka.com.ua/ua/computers-notebooks/c80253/",
                "https://rozetka.com.ua/ua/telefony-tv-i-ehlektronika/c4627949/",
                "https://rozetka.com.ua/ua/game-zone/c80261/", "https://bt.rozetka.com.ua/ua/"};
        String[] titles = {"Комп'ютери та ноутбуки - ROZETKA | Комп'ютери та ноутбуки у Києві, Харкові, Одесі, Львові: " +
                "ціна, відгуки, продаж оптом комп'ютерів і ноутбуків",
                "Смартфони, ТВ і електроніка - ROZETKA | Купити смартфони, ТВ і електроніку у Києві: ціна, відгуки, прод",
                "Товари для геймерів - ROZETKA | Купити товари для геймерів в Києві: ціна, відгуки, продаж",
                "Побутова техніка - ROZETKA | Магазин побутової техніки у Києві, Харкові, Одесі, Львові: ціна, відгуки, продаж, купити оптом побутову техніку"};

        for (int i = 0; i < url.length; i++) {
            webDriver.navigate().to(url[i]);
            String title = webDriver.getTitle();
            if (titles[i].equals(title)) {
                System.out.println("Title " + (i + 1) + " OK");
            } else {
                System.out.println("Title " + (i + 1) + " неправильный");
                System.out.println("Должно быть так : " + title);
                System.out.println("Нам приходит так : " + titles[i]);
            }
        }
        for (int i = url.length -1 ; i >= 0; i--) {
            System.out.println("Url " + (i +1) + " = " + webDriver.getCurrentUrl());
            webDriver.navigate().back();
        }
        for (int i = 0; i < url.length; i++) {
            webDriver.navigate().forward();
        }
        webDriver.quit();
    }
}

