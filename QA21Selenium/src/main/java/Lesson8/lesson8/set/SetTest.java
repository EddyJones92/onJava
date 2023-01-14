package Lesson8.lesson8.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetTest {

  public static void main(String[] args) {

    List<String>strings = new ArrayList<>();
    strings.add("qqqq");
    strings.add("www");
    strings.add("www");
    strings.add("qqqq");
    strings.set(2, "eeee");

    System.out.println(strings);

    Set<String> stringSet = new HashSet<>();
    stringSet.add("hello");
    stringSet.add("www");
    stringSet.add("eee");
    stringSet.add("qqqq");
    stringSet.add("hello");

    System.out.println(stringSet);
    System.out.println("hello".hashCode());
    System.out.println("hello".hashCode());
    System.out.println("www".hashCode());
    System.out.println("eee".hashCode());
    System.out.println("qqqq".hashCode());


    Set<String> stringSet1 = new LinkedHashSet<>();
    stringSet1.add("hello");
    stringSet1.add("www");
    stringSet1.add("eee");
    stringSet1.add("qqqq");
    stringSet1.add("hello");

    //System.out.println(stringSet1);

    Iterator<String> iterator = stringSet1.iterator();
    while (iterator.hasNext()){
      System.out.println("iterator.next() = " + iterator.next());
    }
    System.out.println();

    for (String s : stringSet1) {
      System.out.println("s = " + s);
    }
  }
}
