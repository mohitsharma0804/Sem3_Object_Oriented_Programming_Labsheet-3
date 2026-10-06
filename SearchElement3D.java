import java.util.Scanner;

public class SearchElement3D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][][] arr = new int[2][2][2];

        System.out.println("Enter 8 elements for 2x2x2 3D array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[i][j][k] = scanner.nextInt();
                }
            }
        }

        System.out.print("Enter element to search: ");
        int target = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (arr[i][j][k] == target) {
                        System.out.println("Element " + target + " found at Position [Layer: " + i + ", Row: " + j + ", Col: " + k + "]");
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("Element " + target + " not found in 3D array.");
        }
        scanner.close();
    }
}