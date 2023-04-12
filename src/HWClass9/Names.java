package HWClass9;

public class Names {
    public static void main(String[] args) {
        /*
        Create an array of names and store all names of your group.
        Then print your name from that array. (use 2 different ways of
        creating an array).
         */

        String [] names={"Duncan","Mimo","Pepper","Emma","Max","Sam","Giddy","Kara"};
        for (int i=0; i<names.length; i++){
            System.out.print(names[i]+" ");
        }

        System.out.println();
        int counter=0;//always need this counter for a while loop

        while(counter<names.length){
            System.out.print(names[counter]+" ");
            counter++;
        }

    }
}
