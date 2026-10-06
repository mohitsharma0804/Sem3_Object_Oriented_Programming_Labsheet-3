import java.util.Scanner;
import java.util.Arrays;

public class SortRowsJaggedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] jagged = new int[3][];
        jagged[0] = new int[4];
        jagged[1] = new int[2];
        jagged[2] = new int[5];

        System.out.println("Enter elements for Jagged Array:");
        for (int i = 0; i < jagged.length; i++) {
            System.out.println("Enter " + jagged[i].length + " elements for Row " + i + ":");
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = scanner.nextInt();
            }
        }

        // Sort each row
        for (int i = 0; i < jagged.length; i++) {
            Arrays.sort(jagged[i]);
        }

        System.out.println("
Jagged Array after sorting each row:");
        for (int i = 0; i < jagged.length; i++) {
            System.out.print("Row " + i + ": ");
            for (int val : jagged[i]) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}