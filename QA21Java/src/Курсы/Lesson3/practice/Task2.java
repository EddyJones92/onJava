package Lesson3.practice;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        int f = s.nextInt();
        System.out.println("Введите число");
        int sec = s.nextInt();
        System.out.println("Введите число");
        int t = s.nextInt();

        System.out.println("Если нужно сложить нажми +");

        System.out.println("Если нужно умножить нажми *");

        String choise = s.next();

        if (choise.equals("+")){

            System.out.println("Сумма = " + (f+sec+t));

        }if (choise.equals("*")){

            System.out.println("Произведение = " +(f*sec*t));
        }

    }


}
