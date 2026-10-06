import java.util.Scanner;

public class RotateLeftOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        if (n > 0) {
            int first = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = first;
        }

        System.out.println("Array after left rotation by 1 position:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
        scanner.close();
    }
}