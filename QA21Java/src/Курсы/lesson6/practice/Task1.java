package lesson6.practice;

import java.util.Scanner;

public class Task1 {
//Задание 1
// Пользователь вводит с клавиатуры строку.
// Произведите поворот строк и
// полученный результат выведите на экран.

  public static void main(String[] args) throws InterruptedException {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter text");
    String str = sc.nextLine();
    System.out.println(str);

//             01234
//String str = "hello";
//System.out.println("str1.length() = " + str.length());

    for (int i = str.length()-1; i >= 0 ; i--) {
      System.out.print(str.charAt(i));
      Thread.sleep(300);
    }
    System.out.println("\n=================");

    char[] chars = str.toCharArray();//из строки массив
    for (int i = chars.length-1; i >= 0 ; i--) {
      System.out.print(chars[i]);
    }

    System.out.println("\n=================");

    StringBuilder builder = new StringBuilder(str);
    builder.reverse();
    builder.append(" hello ").append(" world");
    System.out.println("builder = " + builder);

    String str2 = builder.toString();//превращает builder в строку

  }
}
