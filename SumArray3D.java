import java.util.Scanner;

public class SumArray3D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][][] arr = new int[2][2][2];
        int sum = 0;

        System.out.println("Enter 8 elements for 2x2x2 3D array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[i][j][k] = scanner.nextInt();
                    sum += arr[i][j][k];
                }
            }
        }

        System.out.println("Sum of all elements in 3D array: " + sum);
        scanner.close();
    }
}