package lesson6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number ");

    int s = sc.nextInt();

    System.out.print("Enter second number ");

    int n = sc.nextInt();

    for (int i = s; i <= n; i++) {
      if (i % 3 == 0 && i % 5 != 0) {
        System.out.println("Fizz");
      } else if (i % 3 != 0 && i % 5 == 0) {
        System.out.println("Buzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz Buzz");
      } else {
        System.out.println(i);
      }
    }
  }
}




