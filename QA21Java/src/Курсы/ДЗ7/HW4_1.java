package ДЗ7;

import java.util.Arrays;
import java.util.Scanner;

public class HW4_1 {

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 1, 2, 4, 5};
        bubbleSort(arr);

    }

    public static void bubbleSort(int[] arr) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите нужный метод rise или low: ");
        String string = sc.next();

        if (string.equalsIgnoreCase("rise")) {

            for (int i = arr.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {

                    if (arr[j] > arr[j + 1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        } else if (string.equalsIgnoreCase("low")) {
            for (int i = arr.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {

                    if (arr[j] > arr[j + 1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                }
            }

            StringBuilder builder = new StringBuilder(Arrays.toString(arr));
            builder.reverse();
            String str = builder.toString();
            System.out.println(str);
        } else {
            System.out.println("Неверный ввод");
        }
    }

}