import java.util.Scanner;

public class CountPosNeg3D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][][] arr = new int[2][2][2];
        int posCount = 0, negCount = 0, zeroCount = 0;

        System.out.println("Enter 8 elements for 2x2x2 3D array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[i][j][k] = scanner.nextInt();
                    if (arr[i][j][k] > 0) posCount++;
                    else if (arr[i][j][k] < 0) negCount++;
                    else zeroCount++;
                }
            }
        }

        System.out.println("Positive numbers count: " + posCount);
        System.out.println("Negative numbers count: " + negCount);
        System.out.println("Zero count: " + zeroCount);
        scanner.close();
    }
}