package lesson5.practice;

import java.util.Scanner;

public class Task6 {

  //Задание 6
  // Пользователь с клавиатуры вводит элементы одномерного массива.
  // Необходимо найти сумму элементов массива, среднеарифметическое,
  // отобразить на экран все элементы массива.
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Введи размер массива");
    int size = scan.nextInt();//задаем размер массива
    int[] arr = new int[size];//0,0,0,0,0,0,0...
    int sum = 0;

    //заполнение массива
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Next...");
      arr[i] = scan.nextInt();
      sum += arr[i];  //sum = sum + arr[i]; присваивание
    }

    System.out.println("sum = " + sum);
    System.out.println("sredn = " + sum/ arr.length);

    //вывод массива
    for (int i = 0; i < arr.length; i++) {
      System.out.print(" " + arr[i]);
    }


  }
}
