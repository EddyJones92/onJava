package ДЗ5;
//Задание 7
//Пользователь с клавиатуры вводит элементы одномерного массива и некоторое число. Необходимо посчитать
//сколько раз данное число присутствует в массиве.

import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args) {
        System.out.print("Введите необходимое количество чисел ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int [size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите число ");
           arr[i] = sc.nextInt();
        }
        System.out.print("Введите искомое число ");
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (x == arr[i]) {
                count++;
            }
        }
        System.out.println("Найдено " + count + " необходимых чисел.");
    }
}
