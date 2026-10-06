import java.util.Scanner;

public class CopyArray1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();

        int[] source = new int[n];
        int[] destination = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            source[i] = scanner.nextInt();
            destination[i] = source[i]; // Copy element
        }

        System.out.println("Elements in destination array:");
        for (int val : destination) {
            System.out.print(val + " ");
        }
        System.out.println();
        scanner.close();
    }
}