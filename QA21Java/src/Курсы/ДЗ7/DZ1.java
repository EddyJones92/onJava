package ДЗ7;
//Задание 1
//Напишите метод, вычисляющий сумму элементов
//массива. Массив передаётся в качестве параметра.

public class DZ1 {
    public static void sum (int[] arr) {
        int sumArr = 0;
        for (int i = 0; i < arr.length ; i++){
            sumArr += arr[i];
        }
        System.out.println(sumArr);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,};
        sum(arr);
    }



}

