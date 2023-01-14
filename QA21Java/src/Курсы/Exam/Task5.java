package Exam;
//5. Найти периметр фигуры по заданным сторонам AB, AС, и CD (см. рисунок)
//Определить метод для расчета гипотенузы прямоугольного треугольника по его катетам.
public class Task5 {
    public static void main(String[] args) {

        double p;
        int ab = 3;
        int ac = 4;
        int cd = 6;
        double bd;
        double bc;

        bc = pifagor(ab,ac);

        bd = pifagor(bc, cd);

        p = ab + ac + cd + bd;

        System.out.println("p = " + p);;

    }
    public static double pifagor(double a, double c){

        double b;
        b = Math.sqrt(a* a + c * c);
        return b;
    }

}
