import java.util.Scanner;

public class TriangularMatrixParts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dimension of square matrix (N): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("
Upper Triangular Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j) {
                    System.out.print(matrix[i][j] + "	");
                } else {
                    System.out.print("0	");
                }
            }
            System.out.println();
        }

        System.out.println("
Lower Triangular Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) {
                    System.out.print(matrix[i][j] + "	");
                } else {
                    System.out.print("0	");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}