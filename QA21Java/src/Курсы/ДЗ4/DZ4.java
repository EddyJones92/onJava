package ДЗ4;
//Пользователь вводит с клавиатуры два числа (начало и
//конец диапазона). Требуется проанализировать все числа
//в этом диапазоне. Вывод на экран должен проходить по
//правилам, указанным ниже.
// Если число кратно 3 (делится на 3 без остатка) нужно
//вывести слово «Fizz». Если число кратно 5 нужно вывести
//слово «Buzz». Если число кратно 3 и 5 нужно вывести
//«Fizz Buzz». Если число не кратно не 3 и 5 нужно вывести
//само число.
import java.util.Scanner;

public class DZ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число ");
        int s = sc.nextInt();
        System.out.print("Введите второе число ");
        int n = sc.nextInt();
        for (int i = s; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            }
            else if (i % 3 != 0 && i % 5 == 0) {
                System.out.println("Buzz");
            }
           else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz Buzz");
            }
           else {
                System.out.println(i);
            }
        }
    }
}
