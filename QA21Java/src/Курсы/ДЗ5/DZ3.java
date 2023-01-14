package ДЗ5;
//Задание 9
//В одномерном массиве, заполненном случайными
//числами вычислить:
//■ Сумму отрицательных чисел;
//■ Сумму четных чисел;
//■ Сумму нечетных чисел;
//■ Произведение элементов с индексами кратными 3;
//■ Произведение элементов между минимальным и максимальным элементом;
//■ Сумму элементов, находящихся между первым и последним положительными элементами.
public class DZ3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int proiz = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 100) - 50);
            if (arr[i] < 0){
                sum += arr[i];
            }
            if (arr[i] % 2 == 0){
                sum1 += arr[i];
            }
            if (arr[i] % 2 != 0){
                sum2 += arr[i];
            }
            if (i % 3 ==0 ){
                proiz = proiz * arr[i];
            }
        }
        System.out.println("Сумма отрицательных чисел " + sum);
        System.out.println("Сумма четных чисел " + sum1);
        System.out.println("Сумма нечетных чисел " + sum2);
        System.out.println("Произведение чисел с индексом кратным '3' " + proiz);
    }
}
