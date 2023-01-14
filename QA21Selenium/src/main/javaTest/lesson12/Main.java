package lesson12;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws NoSuchFieldException {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello");
    System.out.println("Google page - 1");
    System.out.println("ItStep h3 - 2");
    System.out.println("ItStep inputs - 3");
    int num = scanner.nextInt();

    switch (num) {
      case 1 -> new Start().run();
      case 2 -> new Start().testH3();
      case 3 -> System.out.println();
    }

  }
}
