package Lesson3.practice;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        System.out.println("Enter number");

        int num;

        if (enter.hasNextInt()) {

            num = enter.nextInt();

            if (num % 2 == 0) {
                System.out.println("Even nunmser");
            } else {
                System.out.println("Odd number");
            }


        } else {
            System.out.println("Wrong input");

        }


    }
}
