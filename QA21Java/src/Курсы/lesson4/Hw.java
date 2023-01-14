package lesson4;

import java.util.Scanner;

public class Hw {

  public static void main(String[] args) {
    int n = 874;
    int a = n / 100;
    int b = n / 10 % 10;
    int c = n % 10;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println("Сумма цифр числа n = " + (a + b + c));

    //Scanner s = new Scanner(System.in);

//      System.out.print("Введите рост ");
//
//      final int height = s.nextInt();
//
//      System.out.print("Введите вес ");
//
//      final int weight = s.nextInt();
//
//      if (weight > height - 110) {
//
//        System.out.println("Вам нужно скинуть " + (weight - (height - 110)) + "кг.") ;
//      }
//      if (weight < height - 110) {
//
//        System.out.println("Вам нужно набрать " + ((height -110) - weight));
//      }
//      if (weight == height - 110) {
//        System.out.println("У вас идеальный вес!");
//      }

    int input = 13961370;

    int sec = 1;

    int min = 60 * sec;

    int hour = min * 60;

    int day = hour * 24;

    System.out.println(
        (input / day) + " days " + (input % day / hour) + " hours " + ((input % day) % hour / min)
            + " minutes " + (((input % day) % hour) % min) + " sec.");



    Scanner scanner = new Scanner(System.in);
    System.out.println("Введи букву");
    String str = scanner.nextLine();//позволяет вводить строку
    //012345
    //qwerty
    char s = str.charAt(0);//получаем первый символ из строки
    System.out.println("s = " + s);


    //счастливый билет

    int nn = 01211;//byte code
    //System.out.println("nn = " + nn);

    int numb = 423027;
    int first = numb/1000;//423  = 4 2 3
    System.out.println(numb/1000);//первая часть
    System.out.println(numb%1000);//вторая часть



  }
}
