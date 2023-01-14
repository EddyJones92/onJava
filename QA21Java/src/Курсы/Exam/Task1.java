package Exam;
//1.Напечатать таблицу умножения на 7 в обратном порядке:
//9 х 7 = 63
//...
//1 х 7 = 7
public class Task1 {
    public static void main(String[] args) {

        int res = 0;

        for (int i = 9; i >= 1; i--) {

            res = 7 * i;

            System.out.println(i + " * 7 = " + res);
        }

    }
}
