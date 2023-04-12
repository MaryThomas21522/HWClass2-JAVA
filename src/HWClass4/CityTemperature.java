package HWClass4;

import java.util.Scanner;

public class CityTemperature {
    public static void main(String[] args) {

        /*
        Create a Java program that will ask user to input city and temperature.
        Your program should convert Fahrenheit into celsius and print “The temperature is the city is ”
         */


        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter city");
        String city=scanner.next();

        System.out.println("Please enter temperature in Fahrenheit");
        float temperature=scanner.nextFloat();

       //convert to Celsius
        float convert=(temperature-32)*5/9F;
        System.out.println("The temperature in Celsius is "+convert);


    }
}
