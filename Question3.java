package programing1project;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter the number of rows: ");
        int rows = kb.nextInt();

        System.out.print("Please enter the number of columns: ");
        int cols = kb.nextInt();

        int[][] matrix = createMatrix(rows, cols);

        System.out.println("Matrix before: ");
        printMatrix(matrix);

        System.out.print("Please enter the number to make disappear: ");
        int target = kb.nextInt();

        int[][] modifiedMatrix = modifyMatrix(matrix, target);

        System.out.println("Matrix after: ");
        printMatrix(modifiedMatrix);

        kb.close();
    }

    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100) + 1;
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] modifyMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] modifiedMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                modifiedMatrix[i][j] = (matrix[i][j] == target) ? 0 : matrix[i][j];
            }
        }

        return modifiedMatrix;

	}

}
