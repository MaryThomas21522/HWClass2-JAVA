package HWClass9;

public class LargestNumber {
    public static void main(String[] args) {
        /*
        From an array of integer elements find the largest number.
        ***THIS IS PART OF THE INTERVIEW QUESTIONS***
         */
        int [] numbers={20,25,35,2,50};
        //create a variable to store the largest assumed number
        int largest=numbers[0];//index 20 we chose 0 since 0 is the first index in an array
        //create a loop that will go through the array
        for (int i = 0; i <=numbers.length-1; i++) {
            largest=numbers[i];
        }System.out.println(largest);
    }

    //enhance for loop
    /*
    for (int num:numbers){
        if(num>largest){
            largest=num;
            }
        }

     */

}
