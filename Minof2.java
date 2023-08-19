// Find a minimum of 2 numbers using a conditional operator.

package first;
import java.util.Scanner;

public class Minof2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int i = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int j = scanner.nextInt();

        int result = (i < j) ? i : j;

        System.out.println(result + " is the minimum number.");

        scanner.close();
    }
}
