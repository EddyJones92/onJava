package lesson4;

public class Loops {

  public static void main(String[] args) {

    //кол-во кругов
    int reis = 5;

    for (int i = 0; i < reis; i++) { //i++ инкремент - увеличение на 1
      System.out.println("Автобус проехал " + (i + 1) + " круг");
    }

    //вывести все числа кратное 3м
    //способ 1 затратный
    for (int i = 10; i <= 30; i++) {
      if (i % 3 == 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println();

    //способ 2 не затратный
    for (int i = 10; i <= 30 ; i = i + 3 ) {
      if(i % 3 == 1){
        System.out.print(i + 2 + " ");
      }
      //System.out.print(i % 3 == 1 ? i + 2 + " ":"");
    }
  }
}
