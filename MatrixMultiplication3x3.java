import java.util.Scanner;

public class MatrixMultiplication3x3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] product = new int[3][3];

        System.out.println("Enter elements for 3x3 Matrix A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements for 3x3 Matrix B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        // Multiplying matrices A and B
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                product[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Product Matrix (A * B):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(product[i][j] + "	");
            }
            System.out.println();
        }
        scanner.close();
    }
}