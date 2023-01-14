package lesson4.practice;

public class Task4_1 {

  //Задание 4
// Пользователь вводит с клавиатуры два числа.
// Нужно посчитать сумму чисел в указанном диапазоне,
// а также среднеарифметическое.
  public static void main(String[] args) {
    int sum = 0;
    int first = 10;
    int second = 20;

    for (int i = first; i <= second; i++) {
      sum = sum + i;
    }
    System.out.println(sum);
    System.out.println((double) sum / (second - first));
  }
}
