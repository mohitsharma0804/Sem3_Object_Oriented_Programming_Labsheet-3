import java.util.Scanner;

public class ReverseArray1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Integers in reverse order:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}