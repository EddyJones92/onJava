package ДЗ2;

import java.util.Scanner;

public class H10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Введите рост ");

        final int height = s.nextInt();

        System.out.print("Введите вес ");

        final int weight = s.nextInt();

        if (weight > height - 110) {

            System.out.println("Вам нужно скинуть " + (weight - (height - 110)) + "кг.") ;
        }
        if (weight < height - 110) {

            System.out.println("Вам нужно набрать " + ((height -110) - weight));
        }
        if (weight == height - 110) {
            System.out.println("У вас идеальный вес!");
        }

    }
}
