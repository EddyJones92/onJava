package ДЗ2;

public class H11 {
    public static void main(String[] args) {

        int input = 13961370;

        int sec = 1;

        int min = 60 * sec;

        int hour = min * 60;

        int day = hour * 24;

        System.out.println((input/day) + " days " + (input%day/hour) + " hours " + ((input%day)%hour/min) + " minutes " + (((input%day)%hour)%min) + " sec." );


    }
}
