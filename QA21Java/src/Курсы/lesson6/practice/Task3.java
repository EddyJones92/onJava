package lesson6.practice;
//Задание 2
// Пользователь вводит
// с клавиатуры строку
// и слово для поиска
// Посчитайте сколько раз в строке
// встречается искомое слово.
// Полученное число выведите на экран.
public class Task3 {
    public static void main(String[] args) {

        String str = "Задание 2 Пользователь вводит с клавиатуры строку и слово для поиска."
                + " Посчитайте сколько раз в строке встречается искомое слово."
                + " Полученное число выведите на экран. слово слово слово слово";

        String wordSearch = "слово";

        String[] strings = str.split("[.\\d\\s\\W]");//для разделения строки на слова


       int wordCount = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("")) {
                continue;
            }
            if (strings[i].equals(wordSearch)) {
                wordCount++;
            }
            //System.out.println(strings[i]);
        }
        System.out.println("wordCount = " + wordCount);

    }
}
