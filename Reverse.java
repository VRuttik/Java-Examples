package first;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		
		int remainder, result =0;
		
		while(num > 0) {
			
			remainder = num % 10;
			result = result * 10 + remainder;
			num = num / 10;
		}
		
		System.out.println("The reverse number is: "+result);
		
		scanner.close();
	}

}
