package HWClass9;

public class Animals {
    public static void main(String[] args) {
        /*
        Create an array of animals and store 5 elements into it.
        Using 2 different loops print all elements from the array.
         */

        //Loop 1
        String[] animals={"Dog","Cat","Bird","Horse","Fish"};
        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i]+" ");
        }


        //Loop 2
        System.out.println();
        int counter=0;//always need this counter for a while loop

        while(counter<animals.length){
            System.out.print(animals[counter]+" ");
            counter++;
        }
    }
}
