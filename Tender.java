package first;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tender {
	
	String company_name;
	double cost;
	double test;
	
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	
	void get() {
		
		try {
			System.out.println("Enter Company Name: ");
			company_name = br.readLine();
			System.out.println("Enter the cost: ");
			cost = Double.parseDouble(br.readLine());
		}
		
		catch(IOException ex) {
			System.out.println(ex);
		}
	}
	
	void show() {
		System.out.println("The cost is minimum for company "+company_name+" which is "+cost);
	}
}


// Main class Program3.java

package first;

public class Program3 {

	public static void main(String[] args) {
		
		Tender t[] = new Tender[5];
		
		for(int i=0;i<5;i++) {
			t[i] = new Tender();
		}
		
		for(int i=0;i<5;i++) {
			t[i].get();
		}
		
		double test = t[0].cost;
		int j=0;
		
		for(int i=0;i<4;i++) {
			
			if(test > t[i].cost) {
				test = t[i].cost;
				j=i;
			}
			
		}

		t[j].show();
	}

}
