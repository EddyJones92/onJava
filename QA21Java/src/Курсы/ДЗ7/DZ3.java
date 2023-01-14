package ДЗ7;

//Задание 3
//Напишите метод, определяющий количество чётных,
//нечётных, положительных, отрицательных элементов
//массива. Массив передаётся в качестве параметра.
public class DZ3 {
    public static void main(String[] args) {
        int [] arr = {-12, 22, 76, 3, -7, 13, 46, -6, 73, 11};
        count(arr);
    }
    public static void count (int[] arr) {
        int even = 0;
        int odd = 0;
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                neg++;
            }
            if (arr[i] > 0) {
                pos++;
            }
            if (arr[i] % 2 == 0) {
                even++;
            }
            if (arr[i] % 2 != 0) {
                odd++;
            }
        }
        System.out.println("neg = " + neg);
        System.out.println("pos = " + pos);
        System.out.println("odd = " + odd);
        System.out.println("even = " + even);
    }
}