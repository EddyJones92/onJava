package Lesson11.lesson11.OOP;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Test test = new Test("Test1");
    System.out.println("test name = " + test.getName());
    System.out.println("test id = " + test.getId());
    test.setName("Hello");
    System.out.println("test name = " + test.getName());
    System.out.println("test id = " + test.getId());

    Test test1 = new Test(23, "Simple");

    List<Test> tests = new ArrayList<>();
    tests.add(new Test(1, "One"));
    tests.add(new Test(2, "One"));
    tests.add(new Test(3, "One"));


    JavaTest javaTest = new JavaTest(12);

    javaTest.setPhone("0999648547");
    javaTest.setName("Java");
    System.out.println(javaTest.getName());
    System.out.println(javaTest.getPhone());
    System.out.println(javaTest.getId());


    Test javaTest1 = new JavaTest();
    javaTest1.setName("hello");

    System.out.println(javaTest1.getName());

    List<String> strings = new LinkedList<>();


  }
}
