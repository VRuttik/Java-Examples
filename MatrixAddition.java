package first;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MatrixAddition {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the matrices: ");
        int numRows = scanner.nextInt();
        System.out.print("Enter the number of columns for the matrices: ");
        int numCols = scanner.nextInt();

        int[][] matrixA = new int[numRows][numCols];
        int[][] matrixB = new int[numRows][numCols];
        int[][] resultMatrix = new int[numRows][numCols];

        System.out.println("\nEnter values for matrix A:");
        inputMatrixValues(scanner, matrixA);

        System.out.println("\nEnter values for matrix B:");
        inputMatrixValues(scanner, matrixB);

        int numThreads = 3; // Number of threads to use

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        int rowsPerThread = numRows / numThreads;
        int remainingRows = numRows % numThreads;
        int currentRow = 0;

        for (int i = 0; i < numThreads; i++) {
            int threadRows = rowsPerThread + (i < remainingRows ? 1 : 0);
            executor.execute(new MatrixAdditionThread(matrixA, matrixB, resultMatrix, currentRow, currentRow + threadRows));
            currentRow += threadRows;
        }

        executor.shutdown();

        while (!executor.isTerminated()) {
            // Wait for all threads to finish
        }

        // Print the result matrix
        System.out.println("\nResult Matrix:");
        printMatrix(resultMatrix);

        scanner.close();
    }

    private static void inputMatrixValues(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter value for element (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
    	
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
