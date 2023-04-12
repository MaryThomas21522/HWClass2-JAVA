package HWClass9;

public class LargestNumber {
    public static void main(String[] args) {
        /*
        From an array of integer elements find the largest number.
         */
        int [] numbers={20,25,35,2,50};
        int largest=numbers[0];//index 20
        for (int i = 0; i <=numbers.length-1; i++) {
            largest=numbers[i];
        }System.out.println(largest);
    }
}
