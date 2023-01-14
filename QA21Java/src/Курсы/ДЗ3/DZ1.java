package ДЗ3;

//С клавиатуры вводится время (количество часов от 0 до
//24) – программа выводит приветствие, соответствующее
//введенному времени (например, ввели 15 часов – выводится
//приветствие «Добрый день»).

import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Введите время суток ");
        int time = t.nextInt();
        if (time > 0 && time <= 4) {
            System.out.println("Доброй ночи");
        }if (time > 22 && time <= 24) {
            System.out.println("Доброй ночи");
        }
        if (time > 4 && time <= 11) {
            System.out.println("Доброе утро");
        }
        if (time > 11 && time <= 17) {
            System.out.println("Добрый день");
        }
        if (time > 17 && time <= 22) {
            System.out.println("Добрый вечер");
        }
        if ( time > 24 ){
            System.out.println("Введите числа в диапазоне от 0 до 24");
        }
    }
}
