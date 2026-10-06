import java.util.Scanner;

public class JaggedArrayBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] jagged = new int[3][];
        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[3];

        System.out.println("Enter elements for Jagged Array:");
        for (int i = 0; i < jagged.length; i++) {
            System.out.println("Enter " + jagged[i].length + " elements for Row " + i + ":");
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = scanner.nextInt();
            }
        }

        System.out.println("
Displaying Jagged Array:");
        for (int i = 0; i < jagged.length; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}