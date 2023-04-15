package HWClass9;

public class Integers {
    public static void main(String[] args) {
        /*
        Create an array on integers and calculate the sum of all elements
        in an array
        ***THIS IS PART OF THE INTERVIEW QUESTIONS***
         */

        int [] numbers={1,2,3,4,5};
        int sum=0;//variable for sum
        //sum is equal to 0 because it starts at 0 and adding 0 does not affect the sum
        /*
        We can use enhance for loop for this task:
        for(int num:numbers){
        sum=sum+num;
        }
        System.out.println(sum);
         */
        for (int i = 0; i <=numbers.length-1; i++) {
            sum=sum+numbers[i];
        }System.out.println(sum);
    }
}
