package ДЗ4;
//Пользователь вводит с клавиатуры число. Требуется
//посчитать факториал числа. Например, если введено 3,
//факториал числа 1*2*3 = 6.
//Формула для расчета факториала: n! = 1*2*3…*n, где
//n — число для расчета факториала.
import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args) {
        System.out.print("Введите число ");
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int fac = 1;
        for (int i = 1; i <= f; i++) {
            fac = fac * i;
        }
        System.out.println(fac);
    }
}
