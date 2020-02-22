package homework15022020;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {//main method
//Declare Main Method
            float temperature;
            Scanner tem = new Scanner(System.in);

            System.out.println("Enter temperature in Fahrenheit");
            temperature = tem.nextInt();

            temperature = ((temperature - 32) * 5) / 9;

            System.out.println("temperature in Celsius = " + temperature);


    }



}
