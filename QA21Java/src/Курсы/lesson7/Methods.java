package lesson7;

import java.util.Arrays;

public class Methods {

  public static void main(String[] args) {
    show();
    show(10);
    show('A');
    int res = show(10, 0);
    System.out.println("res = " + res);

    int[] arr = {10, 20, 30, 40};
    int[] arrRev = reverse(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(arrRev));
    System.out.println(Arrays.toString(reverseNew(arr)));
  }

  public static void show() {
    System.out.println(12 + 27);
  }

  public static void show(int num) {
    System.out.println(num * 2);
  }

  public static void show(char ch) {
    System.out.println(ch * 2);
  }

  public static int show(int num1, int num2) {
    if (num2 == 0) {
      System.out.println("деление на 0!!!!!");
      return 0;
    }
    return num1 / num2;
  }

  public static int[] reverse(int[] arr) {
    int[] arrNew = new int[arr.length];
    int start = 0;
    for (int i = arr.length - 1; i >= 0; i--) {
      arrNew[start] = arr[i];
      start++;
    }
    return arrNew;
  }


  public static int[] reverseNew(int[] arr) {
    int[] arrNew = new int[arr.length];
    for (int i = arr.length - 1, k = 0; i >= 0; i--, k++) {
      arrNew[k] = arr[i];
    }
    return arrNew;
  }
}
