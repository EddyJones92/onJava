package ДЗ3;

//Программа запрашивает шестизначное число. После ввода определяет, будет ли являться «счастливым» билет с таким номером
// (сумма первых трех цифр совпадает с суммой трех последних).
//
//Пример входных данных:
//423027
//954832
//Вывод:
//Да
//Нет

public class DZ4 {

    public static void main(String[] args) {
        int num1 = 423027/1000;
        int num11 = 423027%1000;
        int num2 = 954832/1000;
        int num22 = 954832%1000;
        int n1 = num1 / 100;
        int n2 = num1 % 100 /10;
        int n3 = num1 % 100 % 10;
        int n5 = num11 / 10;
        int n6 = num11 % 10;
        int n7 = num2 / 100;
        int n8 = num2 % 100;
        int n9 = num2 % 100 % 10;
        int n10 = num22 / 100;
        int n11 = num22 % 100 / 10;
        int n12 = num22 % 100 % 10;
        System.out.println(n1 + " "+ n2+ " " + n3 + " " + n5 + " " + n6 );
      if (n1+n2+n3 == n5+n6) {
          System.out.println("Билет 1 счастливый");
      }
      if (n7+n8+n9 == n10+n11+n12) {
          System.out.println("Билет 2 счастливый");
      }
      if (n1+n2+n3 != n5+n6){
          System.out.println("Билет 1 не счастливый");
      }
      if (n7+n8+n9 != n10+n11+n12) {
          System.out.println("Билет 2 не счастливый");}
    }
}
