package lesson9;

import java.util.Arrays;

public class Task5 {
  //Заполнить массив на 10 элементов случайными числами
  //от -10 до +10. Посчитать количество повторяющихся значе-
  //ний. Вывести на консоль только повторяющиеся элементы
  //и количество повторений.
  //Пример:
  //0 – 5 раз
  //2 – 3 раза
  //7 – 1 раз
  public static void main(String[] args) {
    final int randomStart = -10;
    final int randomFinish = 10;
    final int randomRange = randomFinish - randomStart;
    final int arrLength = 10;
    int[] arr = new int[arrLength];
    boolean[] arrIsCopy = new boolean[arrLength];

    // fill array
    for (int i = 0; i < arrLength; i++)
      arr[i] = (int) Math.round(Math.random() * randomRange + randomStart);

    System.out.println(Arrays.toString(arr));

    // check array elements
    for (int i = 0; i < arrLength; i++) {
      if (arrIsCopy[i]) continue;
      int duplicateCount = 0;
      for (int j = i + 1; j < arrLength; j++) {
        if (arr[i] == arr[j]) {
          arrIsCopy[j] = true;
          duplicateCount++;
        }
      }
      if (duplicateCount > 0) System.out.printf("%s : %sx time(s)\n", arr[i], duplicateCount);
    }
  }

}
