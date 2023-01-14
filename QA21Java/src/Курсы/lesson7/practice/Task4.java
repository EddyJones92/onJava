package lesson7.practice;

public class Task4 {

  //Задание 4
// Ввести строку с клавиатуры (латиницей).
// Из введенной строки выбрать все слова,
// начинающиеся на гласные буквы и заканчивающиеся на согласные.
// Вывести отобранные слова на консоль.
  public static void main(String[] args) {
    String string = "Lorem ipsum dolor sit amet,"
        + " consectetur adipisicing elit."
        + " Eum perferendis quas repellat vel y voluptas."
        + " Ad cupiditate doloremque dolores eius facilis illo,"
        + " obcaecati odio optio quam, quod rerum sunt suscipit voluptates?";

    String[] strings = string.split("[.\\s?,]");

    for (int i = 0; i < strings.length; i++) {
      if (strings[i].length() > 0) {
        String firstWord = String.valueOf(
            strings[i].charAt(0));//получаем первый символ в виде строки
        String lastWord = String.valueOf(
            strings[i].charAt(strings[i].length() - 1));//получаем последний символ в виде строки
        if ("aoyieu".contains(firstWord.toLowerCase()) && !"aoyieu".contains(
            lastWord.toLowerCase())) {
          System.out.println(strings[i]);
        }
      }
    }
    //получить строку из чего либо
    String s = String.valueOf(12);
    String s1 = 12 + "";
    int[] arr = {65, 66, 67, 68, 69};
    String s2 = new String(arr, 0, arr.length-1);
    System.out.println("s2 = " + s2);
  }
}
