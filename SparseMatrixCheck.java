import java.util.Scanner;

public class SparseMatrixCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        int zeroCount = 0;
        int totalElements = rows * cols;

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 0) {
                    zeroCount++;
                }
            }
        }

        if (zeroCount > (totalElements / 2)) {
            System.out.println("The given matrix IS a Sparse Matrix.");
        } else {
            System.out.println("The given matrix is NOT a Sparse Matrix.");
        }
        System.out.println("Zero count: " + zeroCount + " / Total elements: " + totalElements);
        scanner.close();
    }
}