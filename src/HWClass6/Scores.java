package HWClass6;

import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        /*
        Write a program that will read three inputs of scores (quiz, mid term, and final scores)
        and determine the grade based on the following rules: if the average score >=90 → grade=A if
        the average score >= 70 and <90 → grade=B if the average score>=50 and <70 → grade=C if the
        average score<50 → grade=F
         */

        //Input quiz
        Scanner scanner = new Scanner(System.in);

        System.out.println("What was your quiz score?");
        int quiz = scanner.nextInt();

        //Input mid-term
        System.out.println("What was your mid-term score?");
        int midterm = scanner.nextInt();

        //Input final scores
        System.out.println("What is you final score?");
        int finalscore= scanner.nextInt();



        int totalaveragescores = ((quiz + midterm +finalscore)/3);

        if (totalaveragescores >= 90) {
            System.out.println("Grade=A");
        } else if (totalaveragescores >= 70 && totalaveragescores <= 90) {
            System.out.println("Grade=B");
        } else if (totalaveragescores >= 50 && totalaveragescores <= 70) {
            System.out.println("Grade=C");
        } else if (totalaveragescores <= 50) {
            System.out.println("Grade=F");

        }
    }
}
