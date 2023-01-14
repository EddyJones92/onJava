package HW8;
//Задание 6
//Заполнить массив на 10 элементов случайными числами
//от -10 до +10. Посчитать количество уникальных значений
//(встречающихся в массиве один раз). Вывести на консоль
//значения уникальных элементов и индексы, под которыми
//они находятся в массиве.
public class HW6 {
    public static void main(String[] args) {

        int[] arr = new int [10];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int)(Math.random()*20) -10;

            boolean flag = true;

            for (int j = 0; j < arr.length; j++) {

                if(arr[i] == arr[j] && i != j){
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.println(i + " = " + arr[i] + " ");
        }
    }
}