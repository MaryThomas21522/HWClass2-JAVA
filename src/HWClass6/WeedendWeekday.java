package HWClass6;

import java.util.Scanner;

public class WeedendWeekday {
    public static void main(String[] args) {
        /*
        1.Write a program that will print whether it is a weekend or weekday.
        If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a weekend”,
        any other day → output “Invalid day”
        2.Ask user to enter a number and then define if number is small,
        medium or large Small number is value between 1 and 10 Medium number is value between 11 and
        100 Large number is value between 101 and 1000
         */


        //Task 1
        Scanner date=new Scanner(System.in);
        System.out.println("Write a number from 1-7 to see what day of the week it fall on");
        int day=date.nextInt();

        if(day>=1 && day<=5){
            System.out.println("It is a weekday");
        }else if(day==6 || day==7){
            System.out.println("It is a weekend");
        }else{
            System.out.println("Invalid day");
        }

        //Task 2
        Scanner days=new Scanner(System.in);
        System.out.println("Enter a number from 1 to 100 to see if it's small, medium, or large");
        int days1=days.nextInt();

        if(days1>=1 && days1<=10){
            System.out.println("This number is small number");
        }else if(days1>=11 && days1<=100){
            System.out.println("This is a medium number");
        }else if(days1>=101 && days1<=1000){
            System.out.println("This is a large number");
        }
    }
}
