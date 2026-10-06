import java.util.Scanner;

public class MatrixDiagonalSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dimension of square matrix (N): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter elements for " + n + "x" + n + " matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int mainDiagonalSum = 0;
        int secDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i];
            secDiagonalSum += matrix[i][n - 1 - i];
        }

        System.out.println("Main diagonal sum: " + mainDiagonalSum);
        System.out.println("Secondary diagonal sum: " + secDiagonalSum);
        scanner.close();
    }
}