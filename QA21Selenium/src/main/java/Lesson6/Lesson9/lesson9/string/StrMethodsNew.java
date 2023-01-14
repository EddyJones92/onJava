package Lesson6.Lesson9.lesson9.string;

import java.util.Locale;

public class StrMethodsNew {

  public static void main(String[] args) {

    String lorem = "Lorem ipsum dolor jAvA sit amet,"
        + " consectetur adipiscing elit, sedJaVa do eiusmod tempor "
        + "incididunt ut jaValabore et dolore magna aliqua. Ut enim "
        + "ad minim veniam, quis nostrud Java exercitation ullamco laboris"
        + " nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor"
        + " in reprehenderit in voluptate velit esse cillum dolore eu fugiat"
        + " nulla pariatur. Excepteur sint occaecat cupidatat non proident, "
        + "sunt in culpa qui officia deserunt mollit anim id est laborum. JAVA";


    String search = "Java";
    int index = lorem.toLowerCase().indexOf(search.toLowerCase());
//    index = lorem.toLowerCase().indexOf(search.toLowerCase());
//    System.out.println("index = " + index);
//    System.out.println("substring = " + lorem.substring(index, index + search.length()));
//
//    index = lorem.toLowerCase().indexOf(search.toLowerCase(),index + 1);
//    System.out.println("index = " + index);
//    System.out.println("substring = " + lorem.substring(index, index + search.length()));
//
//    index = lorem.toLowerCase().indexOf(search.toLowerCase(),index + 1);
//    System.out.println("index = " + index);
//    System.out.println("substring = " + lorem.substring(index, index + search.length()));
    while (index >= 0){
      System.out.println("index = " + index);
      System.out.println("substring = " + lorem.substring(index, index + search.length()));
      index = lorem.toLowerCase().indexOf(search.toLowerCase(), index + 1);
    }
  }
}
