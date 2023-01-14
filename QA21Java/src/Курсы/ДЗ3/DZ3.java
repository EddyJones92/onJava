package ДЗ3;

//Пользователь вводит с клавиатуры букву. Программа
//должна определить, в какой раскладке введена буква – в латинской или кирилице. Вывести в консоль: «латиница», если
//буква введена латиницей или «кирилица», если буква относится к кирилическому алфавиту. Если введена цифра, а не
//буква, вывести «цифра». Если символ не относится ни к буквам, ни к цифрам, вывести «невозможно определить».

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DZ3 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите символ: ");
        String simvol = sc.nextLine();
        Pattern patlat = Pattern.compile("[a-zA-Z]?");
        Matcher matlat = patlat.matcher(simvol);
        Pattern patkir = Pattern.compile("[а-яА-Я]?");
        Matcher matkir = patkir.matcher(simvol);
        Pattern patnum = Pattern.compile("[0-9]?");
        Matcher matnum = patnum.matcher(simvol);
        if(matlat.matches())
        {
            System.out.println("Латиница");
        }else
        if(matkir.matches())
        {
            System.out.println("Кирилица");
        }else
        if(matnum.matches())
        {
            System.out.println("Цифра");
        }
        else
        {
            System.out.println("Невозможно определить");
        }
    }
}
