// Factorial.java

package first;

public class Factorial{
	
	int fact(int n) {
		int result;
		if(n==1)
			return 1;
		result = fact(n-1) * n;
		return result;
	}
}

//----------------------------------Main class Recursion.java-------------

/* 2. Define a class Factorial with instance variable n and find the factorial of n using
  the recursive method. */


package first;

public class Recursion {

	public static void main(String[] args) {
		
		Factorial f = new Factorial();
		
		System.out.println("Factorial of 3 = " + f.fact(3));
		System.out.println("Factorial of 5 = " + f.fact(5));
	}
}
