package ДЗ4;

//Пользователь вводит с клавиатуры длину линии.
//Нужно отобразить на экране горизонтальную линию из *,
//указанной длины.
//Например, если было введено 7, тогда вывод на экран
//будет такой:
//*******
import java.util.Scanner;

public class DZ2 {
    public static void main(String[] args) {
        System.out.print("Введите число ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}
