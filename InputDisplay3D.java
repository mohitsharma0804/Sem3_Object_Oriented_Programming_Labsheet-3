import java.util.Scanner;

public class InputDisplay3D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][][] arr = new int[2][2][2];

        System.out.println("Enter 8 elements for a 2x2x2 3D array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[i][j][k] = scanner.nextInt();
                }
            }
        }

        System.out.println("Elements of the 2x2x2 3D array:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}