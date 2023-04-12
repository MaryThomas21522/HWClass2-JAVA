package HWClass6;

import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        /*
        Write a program for user to enter his/hers birth month.
        Based on the month define the season. Example: if user is born in March,
        April, May → season =”Spring” if user is born in June, July, August → season =”Summer” etc …
        At the end of the program we should see 1 output as “You were born is season __”.
         */

        Scanner season = new Scanner(System.in);
        System.out.println("In text format, enter your birth month");
        String dob = season.next();

        if (dob.equals("March") || dob.equals("April") || dob.equals("May")) {
            System.out.println("You are a Spring baby!");
        } else if (dob.equals("June") || dob.equals("July") || dob.equals("August")) {
            System.out.println("You are a Summer baby!");
        } else if (dob.equals("September") || dob.equals("October") || dob.equals("November")) {
            System.out.println("You are a Fall baby!");
        } else if (dob.equals("December") || dob.equals("January") || dob.equals("February")) {
            System.out.println("You are a Winter baby!");

        }
    }
}
