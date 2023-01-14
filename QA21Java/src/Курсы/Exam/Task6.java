package Exam;

import java.util.Scanner;

//6.	Написать программу, которая принимает стоимость покупок в магазине и выдает
// сумму к оплате с учетом следующей скидки:
//- 0 – 250: нет скидки
//- 251 – 500: скидка 5%
//- 501 – 1000: скидка 10%
// - 1001 и более: скидка 15%
public class Task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите сумму покупки: ");
        int sum = sc.nextInt();

        if (sum <= 250) {
            System.out.println("Сумма покупки: " + sum);
        } else if (sum <= 500) {
            double sale5 = (sum * 0.95);
            System.out.println("Сумма покупки, учитывая скидку 5% : " + sale5);
        } else if (sum <= 1000) {
            double sale10 = (sum * 0.9);
            System.out.println("Сумма покупки, учитывая скидку 10% : " + sale10);
        } else  {
            double sale15 = (sum * 0.85);
            System.out.println("Сумма покупки, учитывая скидку 15% : " + sale15);
        }

    }
}
