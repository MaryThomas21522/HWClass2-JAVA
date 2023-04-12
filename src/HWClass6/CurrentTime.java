package HWClass6;

import java.util.Scanner;

public class CurrentTime {
    public static void main(String[] args) {
        /*
        Write a program that will ask user to input inputs the current time (use 24 hour format).
        Based on the given time define: if hour is between 1-11 --> Morning if hour between 12-15 --> Afternoon
        if hour between 16-20 --> Evening if hour between 21-24 --> Night
         */

        Scanner time=new Scanner(System.in);
        System.out.println("Enter current time in 24 hour format");
        int hours=time.nextInt();

        if(hours>=1 && hours<=11){
            System.out.println("It is the morning");
        }else if(hours>=12 && hours<=15){
            System.out.println("It is the afternoon");
        }else if(hours>=16 && hours<=20){
            System.out.println("It is the evening");
        }else if(hours>=21 && hours<=24){
            System.out.println("It is the night");
        }

    }
}
