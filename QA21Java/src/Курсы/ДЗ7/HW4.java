package ДЗ7;

import java.util.Arrays;

public class HW4 {

    public static void main(String[] args) {
        int [] arr = {2,4,5,6,1,2,4,5};
      selectionSort(arr);
    }

    public static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            int min = arr[i];
            int min_i = i;

            for (int j = i+1; j < arr.length; j++) {

                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
