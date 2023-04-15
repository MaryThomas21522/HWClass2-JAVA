package HWClass10;

public class Integer2D {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type and store numbers in 3
        rows and 3 columns. Print the sum of all numbers.
         */

        int[][] matrix = {
                {10, 20, 30},
                {30, 20, 10},
                {20, 10, 30}
        };

        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                sum += matrix[row][column];
            }
        }
        System.out.println(sum);
    }
}


//
//System.out.println("---- Total Countries Listed --------");
//        //total counties entered in matrix
//        int totalcountries=0;
//        for (int i = 0; i < matrix.length; i++) {
//        totalcountries +=(matrix[i].length);
//        }
//        System.out.println(totalcountries);
