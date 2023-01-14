package ДЗ3;

//другой способ написания кода ко второму заданию

import java.util.Scanner;

public class Task222 {public static void main(String[] args) {

    Scanner t = new Scanner(System.in);

    System.out.print("Введите время суток ");

    int time = t.nextInt();




    if (time > 0 && time <= 4) {

        System.out.println("Good night");


    } else if (time > 22 && time <= 24) {

        System.out.println("Good night");


    }
    else if (time > 4 && time <= 11) {

        System.out.println("Good morning");
    }
    else if (time > 11 && time <= 17) {

        System.out.println("Good afternoon");
    }
    else if (time > 17 && time <= 22) {

        System.out.println("Good evening");
    }
    else {

        System.out.println("Введите числа в диапазоне от 0 до 24");
    }


}
}
