package lesson6;

public class StringMethods {

  public static void main(String[] args) {

    String str = "Hello World";
    System.out.println("str.toUpperCase() = " + str.toUpperCase());
    System.out.println("str.toLowerCase() = " + str.toLowerCase());
    System.out.println("replace = " + str.replace("Hello", "Hi"));
    System.out.println("str.contains W = " + str.contains("W"));
    System.out.println(str);

    String palindrom = "А буду я у дубай";
    String palindrom1 = palindrom.replace(" ", "");//Aбудуяудуба
    String palindrom2 = palindrom1.toLowerCase();//aбудуяудуба
    StringBuilder builder = new StringBuilder(palindrom2);
    builder.reverse();
    String newPalindrom = builder.toString();

    System.out.println("palindrom2 = " + palindrom2);
    System.out.println("newPalindrom = " + newPalindrom);
    System.out.println(palindrom + " " + (palindrom2.equals(newPalindrom) ? "Палиндром" : "Не палиндром"));
    //System.out.println(newPalindrom.equals(palindrom2));

  }
}
