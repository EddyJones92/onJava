package Exam;
//2. Используя цикл while необходимо вывести на экран следующую последовательность чисел:
//7 14 21 28 35 42 49 56 63 70 77 84 91 98.
public class Task2 {
    public static void main(String[] args) {

        int [] nums  = new int [120];

        for (int i = 0; i < nums.length; i++) {

            nums [i] = i;

            while (true){

                if (nums [i] % 7 == 0 && nums[i] < 100 && nums[i] != 0){
                    System.out.println(nums[i]);
                }
                if (nums[i] > 100){
                    System.out.println("Не соответствует условию");
                } break;

            }
        }
    }
}
