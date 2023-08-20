package first;
import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        int originalNum = num; // Store the original number
        
        int result = 0, remainder;

        while (num > 0) {
            remainder = num % 10;
            result = result + (int) Math.pow(remainder, 3);
            num = num / 10;
        }

        if (result == originalNum) { // Compare with the original number
            System.out.println("The number is Armstrong.");
        } 
        else {
            System.out.println("The number is not Armstrong.");
        }

        scanner.close();
    }
}
