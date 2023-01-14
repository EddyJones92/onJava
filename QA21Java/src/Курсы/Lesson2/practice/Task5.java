package Lesson2.practice;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сторону квадрата");
        int side = scan.nextInt();

        System.out.println("Площадь квадрата = " + (int)Math.pow(side, 2));
    }
}
