package HWClass9;

public class Grade {
    public static void main(String[] args) {
        /*
        Create an array of chars and store grades into it: A,B,C,D.
        Then print a grade B (use 2 different ways of creating an array).
         */

        //Loop 1
        char[] grade = {'A', 'B', 'C', 'D'};
        System.out.println(grade[1]);

        System.out.println();

        //Loop 2
        char[] gradenow=new char[4];
        gradenow[0]='A';
        gradenow[1]='B';
        gradenow[2]='C';
        gradenow[3]='D';

        System.out.println(gradenow[1]);
        }
    }

