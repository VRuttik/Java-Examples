package first;
import java.util.Scanner;
public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		
		int sum = 0;
		
		for(int i=1;i<num;i++) {
			
			if(num%i == 0) {
				sum = sum + i;
			}
		}
		
		if(sum == num) {
			System.out.println("The number is perfect.");
		}
		else {
			System.out.println("The number is not perfect.");
		}
		
		scanner.close();
	}

}
