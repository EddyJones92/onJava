package ДЗ6;
//Задание 1
//Ввести с клавиатуры строку текста, а затем один символ.
//Показать на консоль индексы и количество совпадений (ищем
//вхождения символа в строку). В случае если совпадений не
//найдено, вывести соответствующий текст.

import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String str = s.nextLine();
        char [] chars = str.toCharArray();
        System.out.println("Введите символ: ");
        char c = s.next().charAt(0);
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (c == chars[i]){
                count++;
                System.out.println("Индексы совпадений - " + i);
            }
        }
        System.out.println(count + " - количество совпадений");
    }
}
