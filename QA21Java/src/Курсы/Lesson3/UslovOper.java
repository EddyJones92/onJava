package Lesson3;

public class UslovOper {
    public static void main(String[] args) {

        int a = 20;
        int b = 20;

        if (a != b) {
            System.out.println("a!=b");
        }else {
            System.out.println("a==b");
        }

        // сравнение с логическими оператарами
        // оператор "и" &&
        // оператор "или" ||

        int num1 = 40;
        int speed = 0;
        int num3 = 70;

        if (speed == 0){
            System.out.println("Машина стоит");
        }else

                    if (speed > num1 && speed < num3){
                        System.out.println("Без штрафа норм скорость");
                    }else if(speed < num1 && speed >0) {
                        System.out.println("Без штрафа скорость низкая");

                    }else if (speed < 0){
                        System.out.println("Штраф за езду назад");
                    }
                    else{
                        System.out.println("Штраф 10000 за превышение");

        }




    }

}
