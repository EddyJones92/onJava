package Lesson2;

import java.util.Scanner;

public class EnterData {
    public static void main(String[] args) {
        //сорздвем переменную у которой вызовем методы ввода данных
        Scanner scanner = new Scanner(System.in);



        System.out.println("Привет. Как тебя зовут?");
        String name = scanner.next(); // считывает данные
        System.out.println("Меня зовут " + name);

        System.out.println("Your age?");
        int age = scanner.nextInt(); // считывает числа

        System.out.println("Сколько ты учишься месяцев? ");
        double study = scanner.nextDouble();

    }
}
