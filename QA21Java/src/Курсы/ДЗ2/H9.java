package ДЗ2;

import java.util.Scanner;

public class H9 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        double num1 = num.nextDouble();

        if (num1 % 1 != 0) {

            System.out.println("Число имеет вещественную часть");

        } else {

            System.out.println("Число без вещественной части");

        }


    }
}
