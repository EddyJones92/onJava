package HW8;

import java.util.HashMap;
import java.util.Map;

//Заполнить массив на 10 элементов случайными числами
//от -10 до +10. Посчитать количество повторяющихся значений. Вывести на консоль только повторяющиеся элементы
//и количество повторений.
//Пример:
//0 – 5 раз
//2 – 3 раза
//7 – 1 раз
public class HW5 {
    public static void main(String[] args) {

        int[] rand = {1, 3, 4, 4, 6, 7, 7, 7, 3, 9};

        Map<Integer, Integer> counter = new HashMap<>();
        for (int x : rand) {
            int newValue = counter.getOrDefault(x, 0) + 1;
            counter.put(x, newValue);
        }

        System.out.println(counter);

    }

}