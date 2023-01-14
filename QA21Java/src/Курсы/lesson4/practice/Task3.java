package lesson4.practice;

public class Task3 {

  //Задание 3
  // Пользователь вводит с клавиатуры два числа.
  // Нужно показать все нечетные числа в указанном диапазоне.
  // Если границы диапазона указаны неправильно
  // требуется произвести нормализацию границ.
  // Например, пользователь ввел 20 и 11,
  // требуется нормализация после которой
  // начало диапазона станет равно 11, а конец 20.
  public static void main(String[] args) {
    int first = 20;
    int second = 11;

    //нормализация границ
    if(first > second){
      int temp = first;//temp = 20
      first = second; //first = 11
      second = temp; //second = 20
    }

    for (int i = first; i <= second; i++) {
      System.out.print(i + " ");
    }



    //цикл проходится в обратном порядке

//                20           11
    for (int i = first; i >= second; i--) { // i-- декремент
      System.out.print(i + " ");
    }
  }
}
