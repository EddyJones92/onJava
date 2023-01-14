package ДЗ3;

//Дана точка на плоскости заданная координатами x и y,
//определить и вывести в консоль, в какой четверти находится точка, в прямоугольной (декартовой) системе координат.
//Четверти обозначены римскими цифрами.

import java.util.Scanner;

public class DZ2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите координаты х ");
        int x = s.nextInt();
        System.out.print("Введите координаты у ");
        int y = s.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("Точка находится в первой четверти");
        }
        if (x < 0 && y > 0) {
            System.out.println("Точка находится во второй четверти");
        }
        if (x < 0 && y < 0) {
            System.out.println("Точка находится в третьей четверти");
        }
        if (x > 0 && y < 0) {
            System.out.println("Точка находится в четвертой четверти");
        }
        if (x==0 && y==0){
            System.out.println("Точка лежит в центре системы координат");
        }else if (x==0 ){
            System.out.println("Точка лежит на векторе у");
        }else if (y==0 ){
            System.out.println("Точка лежит на векторе x");
        }
    }
}
