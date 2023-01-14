package HW8;

import java.io.Console;

//Задание 7
//Заполнить массив размерности n случайными цифрами
//от 3 до 13. Подсчитать, сколько раз встречается каждая цифра. Вывести результат на экран. n – задается с клавиатуры
public class HW7 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 4, 7, 11, 13, 12, 12, 4, 5, 6, 5, 4, 5, 3, 11, 13, 8, 9, 8, 4};
        int[] arr2 = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        int count10 = 0;


        for (int j = 0; j < arr.length; j++) {
            if (arr2[0] == arr[j]) {
                count++;
            }
            if (arr2[1] == arr[j]) {
                count1++;
            }
            if (arr2[2] == arr[j]) {
                count2++;
            }
            if (arr2[3] == arr[j]) {
                count3++;
            }
            if (arr2[4] == arr[j]) {
                count4++;
            }
            if (arr2[5] == arr[j]) {
                count5++;
            }
            if (arr2[6] == arr[j]) {
                count6++;
            }
            if (arr2[7] == arr[j]) {
                count7++;
            }
            if (arr2[8] == arr[j]) {
                count8++;
            }
            if (arr2[9] == arr[j]) {
                count9++;
            }
            if (arr2[10] == arr[j]) {
                count10++;
            }
        }
        System.out.println("Цифра " + arr2[0] + " повторяется " + count + " раз");
        System.out.println("Цифра " + arr2[1] + " повторяется " + count1 + " раз");
        System.out.println("Цифра " + arr2[2] + " повторяется " + count2 + " раз");
        System.out.println("Цифра " + arr2[3] + " повторяется " + count3 + " раз");
        System.out.println("Цифра " + arr2[4] + " повторяется " + count4 + " раз");
        System.out.println("Цифра " + arr2[5] + " повторяется " + count5 + " раз");
        System.out.println("Цифра " + arr2[6] + " повторяется " + count6 + " раз");
        System.out.println("Цифра " + arr2[7] + " повторяется " + count7 + " раз");
        System.out.println("Цифра " + arr2[8] + " повторяется " + count8 + " раз");
        System.out.println("Цифра " + arr2[9] + " повторяется " + count9 + " раз");
        System.out.println("Цифра " + arr2[10] + " повторяется " + count10 + " раз");

    }
}