package lesson7;

public class Hw {

  public static void main(String[] args) {
    String str = "hello. how are you? добрый день!";

    String[] strings = str.split("[.?!]");

    System.out.println(strings[1]);

    for (int i = 0; i < strings.length; i++) {
      strings[i] = strings[i].trim();//trim() убирает пробелы в начале и конце строки
      char[] chars = strings[i].toCharArray();//разбиваем слово на массив символов
      chars[0] = Character.toUpperCase(strings[i].charAt(0));//меняем первый символ на большой
      strings[i] = new String(chars);//из массива символов получаем строку вариант 1
      strings[i] = String.valueOf(chars);//из массива символов получаем строку вариант 2
      System.out.println(strings[i]);
    }
  }
}
