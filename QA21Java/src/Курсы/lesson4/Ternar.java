package lesson4;

public class Ternar {

  public static void main(String[] args) {
    char a = 'A';
    System.out.println((int) a);
    System.out.println((int) 'a');
    System.out.println((char) 64);

//    if (a >= 'A' && a <= 'Z') {
//      System.out.println("Буквы в верхнем регистре");
//    } else {
//      System.out.println("Другой символ");
//    }

    //Тернарный оператор
    String res = a >= 'A' && a <= 'Z' ? "Буквы в верхнем регистре" : 10 > 15 ? "Дa" : "Нет";

    int resInt = 10 < 15 ? 100 : 200;

    if (10 < 15) {
      System.out.println(100);
    } else {
      System.out.println(200);
    }

    System.out.println("res = " + res);


  }
}
