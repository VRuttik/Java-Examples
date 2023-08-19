package first;

import java.util.Scanner;

public class Evenodd {

	int num;
	
	void accept(int n) {
		num = n;
	}
	
	void check() {
		
		if(num%2 == 0) {
			System.out.println("The number is even.");
		}
		else {
			System.out.println("The number is odd.");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Evenodd e = new Evenodd();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int b =scanner.nextInt();
		
		e.accept(b);
		e.check();
		
		scanner.close();
	}

}
