package Lesson1;

public class Types {
    public static void main(String[] args) {

        //типы данных (примитивные)
        byte age = 127;  //2^8
        short s = 60;    //2^16
        int num = 999999999;    //2^32
        long l = 9999999999l;     //2^64

        float fl = 1.5f;
        double doo = 1.5;


        char ch = 'A';
        boolean bool = false; //true


        age = 45;
        age = 10;

        String catNameSim = "Моему коту ";
        System.out.println(catNameSim  + (age + 10) + " лет");

        System.out.println("Моему коту " + (age + 10)+ " лет");
        System.out.println(age + 10+ " лет моему коту");

        //ссылочные типы данных
        String str = "Hello";

        //переведине типов
        age =(byte)130;  //-128------0--------127
        System.out.println("age =" + age);

        byte num1 = 100;
        int num2 = num1;

        //practice
        int first = 5;
        int second = 15;
        System.out.println("сложение = " + (first + second));
        System.out.println("вычитание = " + (first - second));
        System.out.println("множение = " + (first * second));
        System.out.println("деление = " + ((double)first / second));


        //Ctrl+D копирование строки
        //Shift+del- удаляет строку
        //ctrl+alt+l выравнивает
        //shift f6 - изменить название таска



    }
}
