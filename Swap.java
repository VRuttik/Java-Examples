// Write a program to swap the values.

package first;
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("*Before Swapping*");
        System.out.println("Number1: " + num1);
        System.out.println("Number2: " + num2);
        
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        
        System.out.println("*After Swapping*");
        System.out.println("Number1: " + num1);
        System.out.println("Number2: " + num2);

        scanner.close();
    }
}
