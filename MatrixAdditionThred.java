package first;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MatrixAdditionThread extends Thread { 
	
   final public int[][] matrixA;
   final public int[][] matrixB;
   final public int[][] resultMatrix;
   final public int rowStart;
   final public int rowEnd;

    public MatrixAdditionThread(int[][] matrixA, int[][] matrixB, int[][] resultMatrix, int rowStart, int rowEnd) {
       
    	this.matrixA = matrixA;
    	this.matrixB = matrixB;
    	this.resultMatrix = resultMatrix;
    	this.rowStart = rowStart;
    	this.rowEnd = rowEnd;
    }

    @Override
    public void run() {
        for (int i = rowStart; i < rowEnd; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
    }
}
