package HWClass9;

public class Integers {
    public static void main(String[] args) {
        /*
        Create an array on integers and calculate the sum of all elements
        in an array
         */

        int [] numbers={1,2,3,4,5};
        int sum=0;//variable for sum
        for (int i = 0; i <=numbers.length-1; i++) {
            sum=sum+numbers[i];
        }System.out.println(sum);
    }
}
