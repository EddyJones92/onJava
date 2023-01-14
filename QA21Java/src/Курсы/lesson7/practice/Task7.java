package lesson7.practice;

//Задание 7
// Пользователь вводит с клавиатуры любую строку.
// Поменять в исходной строке все
// большие буквы на маленькие,
// а маленькие – на большие.
// Если в строке присутствуют цифры,
// заменить на символ подчеркивания и вывести результат на консоль.
public class Task7 {

  public static void main(String[] args) {
    String str = change("AAAaaaCCCcc   GGgg213hhhHHH");
    System.out.println(str);
  }

  public static String change(String str) {
    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (Character.isDigit(chars[i])) {
        chars[i] = '_';
      } else if (Character.isLowerCase(chars[i])) {
        chars[i] = Character.toUpperCase(chars[i]);
      } else if (Character.isUpperCase(chars[i])) {
        chars[i] = Character.toLowerCase(chars[i]);
      }
    }
    return String.valueOf(chars);
  }
}
