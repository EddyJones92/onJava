package Exam;

//3. На ввод в программу натурального числа из диапазона [1..25]
// программа выводит это число и согласованное
// с ним слово «книга». Например, на ввод числа 1 программа выводит «1 книга»,
// на ввод числа 2 — «2 книги» и т. д.
public class Task3 {
    public static void main(String[] args) {

        int num;

        for (int i = 1; i <= 25; i++) {

            num = i;

            if (num == 1 || num == 21) {
                System.out.println(num + " книга");
            } else if (num >= 2 && num <= 4 || num >= 22 && num <= 24) {
                System.out.println(num + " книги");
            } else {
                System.out.println(num + " книг");
            }

        }

    }
}
