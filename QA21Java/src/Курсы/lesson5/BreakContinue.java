package lesson5;

public class BreakContinue {

  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        continue;//останавливает выполнение дальнейшего кода
      }
      System.out.print(i + " ");
    }

    System.out.println();

    //вывести все кроме кратных 5
    for (int i = 0; i < 50; i++) {
      if (i % 5 == 0) {
        continue;
      }
      System.out.print(i + " ");
    }
  }
}
