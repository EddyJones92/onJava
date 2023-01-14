package ДЗ2;

public class DZ2 {
    public static void main(String[] args) {
        int n = 345;
        int num1 = n/100;
        int num2 = n % 100 / 10;
        int num3 = n % 100 % 10;
        System.out.println("The number is " + num1 + num2 +num3 );
    }
}
