package ДЗ5;

//Задание 8
//В одномерном массиве, заполненном случайными
//числами, определить минимальный и максимальный
//элементы, посчитать количество отрицательных элементов, посчитать количество положительных элементов,
//посчитать количество нулей. Результаты вывести на
//экран.
public class DZ2 {
    public static void main(String[] args) {
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int min = 0;
        int max = 0;
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)((Math.random() * 100) - 50);
            if (arr[i] == 0) {
                count++;
            }
            if(arr[i] < 0 ){
                count1++;
            }
            if (arr[i] > 0){
                count2++;
            }
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(count2 + " положительных");
        System.out.println(count1 + " отлицательных");
        System.out.println(count + " нолей");
        System.out.println("Min " + min);
        System.out.println("Max " + max);
    }
}
