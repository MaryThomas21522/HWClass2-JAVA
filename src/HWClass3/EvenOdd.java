package HWClass3;

public class EvenOdd {
    public static void main(String[] args) {

        /*
        Create a Java program and declare int variable that will hold a month.
        Based on the value of the variable your program should print the name of the month.
        Write a program to check whether number is positive or negative.
        Write a Java Program to check whether number is Even or Odd.
         */

        //The instructions above is incorrect because he hasn't taught us "else if" statements
        //The updated instructions
            /*
            Write a program to check whether number is positive or negative.
            Write a Java Program to check whether number is Even or Odd.
             */



        //Program to print name of the month instead of int
//        int month=8;
//
//        if (month==8) {
//            System.out.println("August");
//        }
//
//        //Program to check if month is postive or negative
//        if (month>0) {
//            System.out.println("Postive");
//        }
//        else {
//            System.out.println("Negative");
//        }
//
//        //Program to check if number is Even or Odd
//        if (month%2==0) {
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }

        //The updated instructions
            /*
            Write a program to check whether number is positive or negative.
            Write a Java Program to check whether number is Even or Odd.
             */
        int number=-20;
        if (number>0) {
            System.out.println("Number is positive");
        } else
            System.out.println("Number is negative");

        int num=5;
        int remainder=num%2;
        if(remainder==0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
