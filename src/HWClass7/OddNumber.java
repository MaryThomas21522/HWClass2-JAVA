package HWClass7;

public class OddNumber {
    public static void main(String[] args) {
        //Print odd numbers between 20 and 50 (2 ways)

        //First way
        int a = 20;
        while (a <= 50) {
            if(a%2==1){
                System.out.print(a + " ");
            }
            a ++;
        }

        //Second way
        System.out.println();
        for(int b=20; b<=50; b++){
            if(b%2==1){
                System.out.print(b+" ");
            }

        }

    }
}
