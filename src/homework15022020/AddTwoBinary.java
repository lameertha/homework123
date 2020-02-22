package homework15022020;


import java.util.Scanner;

public class AddTwoBinary {//class

        public static void main(String[] args) {//main method

            Scanner scan = new Scanner(System.in);//scanner class
            System.out.println("Enter first binary number: ");//printing statement
            String x = scan.next();
            System.out.println("Enter second binary number: ");
            String Y = scan.next();
            int n1 = Integer.parseInt(x, 2);// used Integer.parseInt method
            int n2 = Integer.parseInt(Y, 2);//used Integer.parseInt method
            int n3 = n1 + n2;//used + operator

            System.out.println("n1:"+Integer.toBinaryString(n1));//printing
            System.out.println("n2:"+Integer.toBinaryString(n2));
            System.out.println("n3=n1+n2:"+Integer.toBinaryString(n3));



        }

    }


