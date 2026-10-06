import java.util.Scanner;

public class SearchElement2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter target element to search: ");
        int target = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Element " + target + " found at Row: " + i + ", Column: " + j);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element " + target + " not found in matrix.");
        }
        scanner.close();
    }
}