package first;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        System.out.println("***Fibonacci Series***");
        int f1 = 0, f2 = 1;

        System.out.print(f1 + " " + f2); // Print the initial two numbers

        for (int i = 3; i <= num; i++) {
            int f3 = f1 + f2;
            System.out.print(" " + f3 + " ");

            f1 = f2;
            f2 = f3;
        }

        scanner.close();
    }
}
