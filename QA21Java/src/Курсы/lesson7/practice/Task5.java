package lesson7.practice;

public class Task5 {

  public static void main(String[] args) {
    //Задание 5
    // Ввести строку с клавиатуры.
    // В строке должны содержаться слова,
    // которые могут быть раздельные пробелами или двоеточиями.
    // Необходимо вычислить количество слов в строке,
    // у которых четное количество букв.

    String str = "Lorem ipsum dolor sit amet:"
        + " consectetur adipisicing elit:"
        + " Eum perferendis quas repellat vel voluptas:"
        + " Ad cupiditate doloremque dolores eius facilis illo:"
        + " obcaecati odio optio quam: quod rerum sunt suscipit voluptates:";

    String[] strings = str.split("[ :]");
    System.out.println("str.length = " + strings.length);
    int count = 0;
    for (int i = 0; i < strings.length; i++) {
      if (strings[i].length() % 2 == 0) {
        count++;
      }
    }
    System.out.println("count = " + count);


  }
}
