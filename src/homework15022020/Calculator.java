package homework15022020;

import java.util.Scanner;

public class Calculator {

        public static void main(String[]args) {
            int first, second, addition, subtract, multiply;
            float divide;
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter First Numbers : ");
            first = scanner.nextInt();
            System.out.print("Enter Second Numbers : ");
            second = scanner.nextInt();

            addition = first + second;
            subtract = first - second;
            multiply = first * second;
            divide = (float) first / second;

            System.out.println("Sum = " + addition);
            System.out.println("Difference = " + subtract);
            System.out.println("Multiplication = " + multiply);
            System.out.println("Division = " + divide);
        }
    }





