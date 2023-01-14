package ДЗ4;
//Пользователь вводит с клавиатуры длину линии и символ для заполнения линии. Нужно отобразить на экране
//вертикальную линию из введенного символа, указанной
//длины.
//Например, если было введено 5 и символ %, тогда
//вывод на экран будет такой:
//%
//%
//%
//%
//%
import java.util.Scanner;

public class DZ3 {
    public static void main(String[] args) {
        System.out.print("Введите число ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("% ");
        }
    }
}
