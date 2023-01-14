package HW8;

//Заполнить массив на 10 элементов случайными числами
//от -10 до +10. Посчитать количество повторяющихся значений. Вывести на консоль только повторяющиеся элементы
//и количество повторений.
//Пример:
//0 – 5 раз
//2 – 3 раза
//7 – 1 раз
public class HW5_1 {
    public static void main(String[] args) {

        int[] arr = {1, 4, 4, 6, 7, 7, 7, 3, 9, 1};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j] && i != j && arr[i] != arr[i+1]){

                    System.out.println(i + " indx = " +arr[i] + " имеет повторения");

                  break;
                }
            }
        }
    }
}
