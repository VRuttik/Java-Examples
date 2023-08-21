package first;
import java.util.Scanner;

public class StudentMarksSimple {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
        
        String[] subjects = {"Marathi", "English", "Hindi", "Science", "Math"};
        int numSubjects = subjects.length;
        
        // Input marks and calculate percentage for each student
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter marks for Student " + i + ":");
            
            // Input marks for each subject
            int totalMarks = 0;
            for (int j = 0; j < numSubjects; j++) {
                System.out.print(subjects[j] + ": ");
                int marks = scanner.nextInt();
                totalMarks += marks;
            }
            
            // Calculate and print percentage
            double percentage = (double) totalMarks / (numSubjects * 100) * 100;
            System.out.println("Student " + i + " Percentage: " + percentage + "%\n");
        }

	}

}
