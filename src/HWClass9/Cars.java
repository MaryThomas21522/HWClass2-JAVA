package HWClass9;

public class Cars {
    public static void main(String[] args) {
        /*
        Create an array of cars and store 6 elements into it.
        Using 2 different loops print all values from the array.
         */

        //Loop 1
        String [] names={"Toyota","Hyundai","Chevy","Ford","Tesla","Mazda"};
        for (int i=0; i<names.length; i++){
            System.out.print(names[i]+" ");
        }

        //Loop 2
        System.out.println();
        for (String name : names) {
            System.out.print(name+" ");
        }

        //Loop3
        System.out.println();
        int i=0;
        while (i< names.length){
            System.out.print(names[i]+" ");
            i++;
        }
    }
}

