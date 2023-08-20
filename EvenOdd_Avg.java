package first;
import java.util.Scanner;

public class EvenOdd_Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		int cntEven=0, SumEven=0, cntOdd=0, SumOdd=0;
		
		for(int i=1;i<=num;i++) {
			
			if(i%2 == 0) {
				cntEven++;
				SumEven = SumEven + i;
			}
			else {
				cntOdd++;
				SumOdd = SumOdd + i;
			}
		}
		
		int EvenAvg=0, OddAvg=0;
		
		EvenAvg = SumEven / cntEven;
		OddAvg = SumOdd / cntOdd;
		
		System.out.println("The Average of first N even number is: "+EvenAvg);
		System.out.println("The Average of first N odd number is: "+OddAvg);
		
		scanner.close();

	}

}
