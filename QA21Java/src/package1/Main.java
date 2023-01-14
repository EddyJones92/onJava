package package1;

import package2.ExampleInPackage2;
import package2.Parent;

public class Main extends Parent{
    public static void main(String[] args) {
        ExampleInPackage1 e1 = new ExampleInPackage1();
  //      System.out.println(e1.name1);
        System.out.println(e1.name2 );
        System.out.println(e1.name3);
        System.out.println(e1.name4);

        ExampleInPackage2 e2 = new ExampleInPackage2();
   //    System.out.println(e2.name1);
   //    System.out.println(e2.name2 );
   //    System.out.println(e2.name3);
        System.out.println(e2.name4);

        Main p = new Main();
     //   System.out.println(p.name1);
     //   System.out.println(p.name2 );
        System.out.println(p.name3);
        System.out.println(p.name4);
    }
}
