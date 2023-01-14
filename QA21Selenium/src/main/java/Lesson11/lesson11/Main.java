package Lesson11.lesson11;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws NoSuchFieldException {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello");
    System.out.println("Google page - 1");
    int num = scanner.nextInt();

    switch (num){
      case 1 -> Start.run();
    }



    /*пример рефлексии*/
//    Class<GooglePage> googlePageClass = GooglePage.class;
//    Field url = googlePageClass.getDeclaredField("url");
//    System.out.println("getName = " + url.getName());
  }
}
