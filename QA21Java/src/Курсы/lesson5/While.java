package lesson5;

import java.util.Scanner;

public class While {

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {

    }
    Scanner s = new Scanner(System.in);
    System.out.println("Вода осталась?");

    //версия 1
    while (s.next().equals("yes")) { // ! оператор НЕ
      System.out.println("Вода осталась?");
    }
    System.out.println("Воды нет");

    //версия 2
    while (true) {
      String str = s.next();
      if (str.equals("yes")) {
        System.out.println("Черпаем дальше");
      } else if (str.equals("no")) {
        System.out.println("Вода закончилась");
        break;
      } else {
        System.out.println("Не верный ввод");
      }
      System.out.println("Вода осталась?");

      // -1 это знак окончания данных

    }
  }
}
