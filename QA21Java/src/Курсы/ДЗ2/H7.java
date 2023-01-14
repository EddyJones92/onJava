package ДЗ2;

// S=(P*I*T/K/100)
public class H7 {
    public static void main(String[] args) {

        int p = 20000;
        int i = 10;
        int t = 730;
        int k = 365;

        int s = (p * i * t / k) / 100;


        int result = s + p;

        System.out.println("Сумма вклада через два года будет равняться " + result);
    }
}
