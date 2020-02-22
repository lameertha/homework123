package homework15022020;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {//main method

        // declaration of variable
        int a;

        // creation of scanner object
        Scanner scan = new Scanner(System.in);

        // calling variable through scanner

        System.out.println("Please enter Decimal Number : ");
        a = scan.nextInt();

        // DecimalToBinary
        String b = Integer.toBinaryString(a);

        // printing statement for binary

        System.out.println("Binary Number is : " + b);
    }
}
