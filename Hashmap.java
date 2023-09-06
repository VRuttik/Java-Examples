package first;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Hasmap {

public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       
       String highestScorer = "";
       String lowestScorer = "";
       int highestScore = Integer.MIN_VALUE;
       int lowestScore = Integer.MAX_VALUE;
       String highestScorerId = "";
       String lowestScorerId = "";

       // Input student information
       while (true) {
           System.out.print("Enter student name (or 'q' to exit): ");
           String name = scanner.nextLine();
           if (name.equalsIgnoreCase("q")) {
               break;
           }

           System.out.print("Enter student ID: ");
           String id = scanner.nextLine();

           System.out.print("Enter student marks: ");
           int marks = scanner.nextInt();
           scanner.nextLine(); // Consume the newline character

           if (marks > highestScore) {
               highestScore = marks;
               highestScorer = name;
               highestScorerId = id;
           }

           if (marks < lowestScore) {
               lowestScore = marks;
               lowestScorer = name;
               lowestScorerId = id;
           }
       }

       // Display the highest and lowest scores with IDs
       System.out.println("Highest Score: " + highestScore + " by " + highestScorer + " (ID: " + highestScorerId + ")");
       System.out.println("Lowest Score: " + lowestScore + " by " + lowestScorer + " (ID: " + lowestScorerId + ")");
       
}

}
