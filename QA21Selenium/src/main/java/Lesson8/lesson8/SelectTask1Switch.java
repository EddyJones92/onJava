package Lesson8.lesson8;

import static java.lang.Math.*;
//import static lesson8.SelectTask1.check;

import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTask1Switch {

  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver",
        "C:\\webdrivers\\chromedriver_win32_105.0.5195.52\\chromedriver.exe");
    WebDriver webDriver = new ChromeDriver();
    String str = "file:///C:/Users/Evgeniy/AppData/Local/Temp/Rar$EXa0.513/Lesson6%20Select/select_practice.html";
    webDriver.get(str);

    //Задание 2.
    //
    //1. Открыть веб-браузер и загрузить страницу select.html.
    //2. В первом выпадающем списке "Multiple select" необходиом выбрать
    //   "Cheese" используя метод selectByIndex класса Select
    //3. Проверить наличие выбранного элемента "Cheese" в select элементе с id = out2
    //4. Далее выбрать "Pepperoni" используя метод selectByValue класса Select
    //5. Проверить наличие выбранного элемента "Cheese" и "Pepperoni" в select элементе с id = out2
    //6. Далее выбрать "Mushrooms" используя метод selectByVisibleText класса Select
    //7. Проверить наличие выбранного элемента "Cheese" и "Pepperoni" и "Mushrooms" в select элементе с id = out2
    //8. Снять выделения со всех элементов списка "Multiple select"
    //9. Проверить отсутствие элементов в списке с id = out2

    Select select1 = new Select(webDriver.findElement(By.id("additives")));
    Select select2 = new Select(webDriver.findElement(By.id("out2")));

    Scanner scanner = new Scanner(System.in);

    int choose = 10;
    while (choose != 0) {
      System.out.println("Для выбора Сыра нажмите 1");
      System.out.println("Для выбора Оливки нажмите 2");
      System.out.println("Для выбора Пепперони нажмите 3");
      System.out.println("Для выхода нажмите 0");
      choose = scanner.nextInt();
      switch (choose) {
        case 1 -> {
          select1.selectByIndex(0);
          check(select1, select2);
        }
        case 2 -> {
          select1.selectByIndex(1);
          check(select1, select2);
        }
        case 3 -> {
          select1.selectByIndex(2);
          check(select1, select2);
        }
      }
    }
  }

  public static void check(Select select1, Select select2) {
    List<WebElement> allSelectedOptions = select1.getAllSelectedOptions();
    List<WebElement> options = select2.getOptions();

    if (allSelectedOptions.size() == options.size()) {
      for (int i = 0; i < options.size(); i++) {
        if (allSelectedOptions.get(i).getText().equals(options.get(i).getText())) {
          System.out.println(options.get(i).getText());
        }
      }
    }
    System.out.println();
  }
}
