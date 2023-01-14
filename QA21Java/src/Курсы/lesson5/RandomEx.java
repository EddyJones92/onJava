package lesson5;

import java.util.Random;

public class RandomEx {

  public static void main(String[] args) {

    int[] arr = new int[10];

    double rand = Math.random();
    System.out.println("rand = " + ((int) (rand * 100) - 50));

    for (int i = 0; i < 10_000; i++) {
      int r = (int) (Math.random() * 11);
      if (r == 10) {
        System.out.println(r);
      }
    }

    Random random = new Random();
    int num = random.nextInt(100)-50;
  }
}
