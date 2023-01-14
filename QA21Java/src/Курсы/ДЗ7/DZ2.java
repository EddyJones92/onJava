package ДЗ7;
//Задание 2
//Напишите метод для нахождения максимума в массиве. Массив передаётся в качестве параметра.
public class DZ2 {
    public static void main(String[] args) {
        int [] arr = {-3,-43,-44,-76,-2,-99};
        max(arr);
    }
    public static void max (int [] arr){
        int maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum){
                maximum = arr[i];
            }
        }
        System.out.println("Max num = " + maximum);
    }
}