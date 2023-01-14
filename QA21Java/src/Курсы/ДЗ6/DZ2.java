package ДЗ6;

import java.util.Scanner;

//Подсчитать среднюю длину слова, во введенном с
//клавиатуры предложении.
public class DZ2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String str = s.nextLine();
        String[] strings = str.split("[ .,]");
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            char[] chars = strings[i].toCharArray();
                sum = sum + chars.length;
        }
        System.out.println((int)sum / strings.length) ;
    }
}
