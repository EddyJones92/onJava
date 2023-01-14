package lesson6;

public class StringExample {

  public static void main(String[] args) {

    //            01234
    String str = "hello";
    char[] chars = {'h', 'e', 'l', 'l', 'o'};
    byte[] bytes = {97, 66, 67, 68, 69};

    String str1 = new String(chars);
    String str2 = new String(bytes);

    System.out.println(str);
    System.out.println(str1);
    System.out.println(str2);

    String newStr = "test";//string pool
    String newStr1 = "test";
    String newStr2 = new String("test");

    System.out.println(newStr == newStr1);//true
    System.out.println(newStr == newStr2);//false
    System.out.println(newStr.equals(newStr2));//true

  }
}
