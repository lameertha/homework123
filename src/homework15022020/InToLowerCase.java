package homework15022020;

import java.util.Scanner;

public class InToLowerCase {


        public static void main(String[] args) {//main method
            String lowerCase;//local variable

            Scanner scan = new Scanner(System.in);// scanner class
            System.out.println("Enter any sentence in capital letter: ");//printing statement
            lowerCase = scan.nextLine();

            System.out.println("Lowercase sentence is: " + lowerCase.toLowerCase());


        }
}
