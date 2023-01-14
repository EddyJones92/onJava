package Exam;

import java.util.Scanner;

//4. Составить программу вычисления значения функции:
// x = 3,56(a + b)^3 – 5,8b^2 + 3,8a -1,5
//при любых значениях a и b (запрашиваем у пользователя).
public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите 'a' = ");
        int a = sc.nextInt();

        System.out.print("Введите 'b' = ");
        int b = sc.nextInt();

        double x = 3.56 * Math.pow((a + b), 3) - 5.8 * Math.pow(b, 2) + 3.8 * a - 1.5;

        System.out.println("x = " + x);
    }
}
