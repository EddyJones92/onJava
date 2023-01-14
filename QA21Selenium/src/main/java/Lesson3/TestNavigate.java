package Lesson3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNavigate {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        //  webDriver.navigate().to("https://rozetka.com.ua/ua/computers-notebooks/c80253/");
        //  webDriver.navigate().to("https://rozetka.com.ua/ua/telefony-tv-i-ehlektronika/c4627949/");
        //  webDriver.navigate().to("https://rozetka.com.ua/ua/game-zone/c80261/");


        String[] url = {"https://rozetka.com.ua/ua/computers-notebooks/c80253/",
                "https://rozetka.com.ua/ua/telefony-tv-i-ehlektronika/c4627949/",
                "https://rozetka.com.ua/ua/game-zone/c80261/"};

        for (int i = 0; i < url.length; i++) {
            webDriver.navigate().to(url[i]);

        }

        String title1 = "Компьютеры и ноутбуки - ROZETKA | Компьютеры и ноутбуки в Киеве, Харькове, Одессе, Львове: " +
                "цена, отзывы, продажа оптом компьютеров и ноутбуков";

        String title = webDriver.getTitle();

        if (title1.equals(title)) {
            System.out.println("Test ok");
        } else {
            System.out.println("Test not ok");
            System.out.println("Должно быть " + title1);
            System.out.println("Получилось " + title);
        }

        String[] urls = {
                "https://rozetka.com.ua/ua/computers-notebooks/c80253/",
                "https://rozetka.com.ua/ua/telefony-tv-i-ehlektronika/c4627949/",
                "https://rozetka.com.ua/ua/game-zone/c80261/"
        };

        String[] titles = {"Компьютеры и ноутбуки - ROZETKA | Компьютеры и ноутбуки в Киеве, Харькове, Одессе, Львове: " +
                "цена, отзывы, продажа оптом компьютеров и ноутбуков",
                "Смартфоны, ТВ и электроника - ROZETKA | Купить смартфоны, ТВ и электронику в Киеве: цена, отзывы, продажа",
                "Товары для геймеров - ROZETKA | Купить товары для геймеров в Киеве: цена, отзывы, продажа"};

        for (int i = 0; i < titles.length; i++) {
            webDriver.getTitle();
        }


    }
}
