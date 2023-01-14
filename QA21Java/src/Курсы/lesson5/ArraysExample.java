package lesson5;

public class ArraysExample {

  public static void main(String[] args) {
    String surname1 = "Ivanov";   //0
    String surname2 = "Petrov";   //1
    String surname3 = "Fedoroff"; //2
    String surname4 = "Mask";     //3

    System.out.println("surname1 = " + surname1);
    System.out.println("surname2 = " + surname2);
    System.out.println("surname3 = " + surname3);
    System.out.println("surname4 = " + surname4);

    String[] lastNames = {
        "Ivanov",  //0
        "Petrov",  //1
        "Fedoroff",//2
        "Mask",    //3
        "Lukas"    //4
    };

    System.out.println("размер массива = " + lastNames.length);
    System.out.println(lastNames[0]);
    System.out.println(lastNames[lastNames.length / 2]);
    System.out.println(lastNames[lastNames.length-1]);

    System.out.println("=========================");

    for (int i = 0; i < lastNames.length; i++) {
      System.out.println(i + " " + lastNames[i]);
    }

    lastNames[4] = "Nemiroff";


    System.out.println("=========================");

    for (int i = 0; i < lastNames.length; i++) {
      System.out.println(i + " " + lastNames[i]);
    }
  }
}
