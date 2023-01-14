package Lesson3.practice;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        int f = s.nextInt();
        System.out.println("Введите число");
        int sec = s.nextInt();
        System.out.println("Введите число");
        int t = s.nextInt();

        System.out.println("Если нужно найти максимум max");

        System.out.println("Если нужно найти среднее min");

        System.out.println("Если нужно найти среднее avg");

        String choise = s.next();

        if(choise.equalsIgnoreCase("max"));  // проаерка без учета регистра
        if (f>sec && f>t){
            System.out.println(f + " is Max");
        }else if (sec>f && sec>t){
            System.out.println(sec + " is Max");
        }else if (t>f && t>sec){
            System.out.println(t + " is Max");
        }else {
            System.out.println("Некоторые числа равны");
        }


    }
}
