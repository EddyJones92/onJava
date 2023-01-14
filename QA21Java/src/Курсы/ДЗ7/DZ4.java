package ДЗ7;

import java.util.Arrays;

//Задание 5
//Напишите метод, переворачивающий содержимое
//массива.
public class DZ4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 12, 16};
        reverse(arr);
    }

    public static void reverse(int[] arr) {
        int[] arrNew = new int[arr.length];
        int num = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arrNew[num] = arr[i];
            num++;
        }
        System.out.println(Arrays.toString(arrNew));
    }
}
