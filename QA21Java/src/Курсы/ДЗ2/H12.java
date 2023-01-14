package ДЗ2;

public class H12 {
    public static void main(String[] args) {



        int n = 100;

        int pie = 1;

        double milk = 0.2;

        double pack = 0.9;


        System.out.println("Если все ученики до 30 кг нужно " + (n*2*pie) + " пирожков и " + (int)(Math.ceil(n*milk/pack)) + " упаковок молока.");

        System.out.println("Если 60% учеников до 30 кг нужно " + (int)(((n*2*pie)*0.6)+(n*pie)*0.4) + " пирожков и " + (int)(Math.ceil((0.6*n)*milk/pack)) + " упаковок молока.");

        System.out.println("Если 1% учеников до 30 кг нужно " + (int)(((n*2*pie)*0.01)+(n*pie)*0.99) + " пирожков и " + (int)(Math.ceil((0.01*n)*milk/pack)) + " упаковок молока.");



    }
}
