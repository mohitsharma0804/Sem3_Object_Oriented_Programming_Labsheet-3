import java.util.Scanner;

public class StudentMarksJagged {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total number of students: ");
        int numStudents = scanner.nextInt();

        double[][] studentMarks = new double[numStudents][];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter number of subjects for Student " + (i + 1) + ": ");
            int subjects = scanner.nextInt();
            studentMarks[i] = new double[subjects];

            System.out.println("Enter marks for " + subjects + " subjects:");
            for (int j = 0; j < subjects; j++) {
                studentMarks[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("
--- Student Marks Report ---");
        for (int i = 0; i < studentMarks.length; i++) {
            System.out.print("Student " + (i + 1) + " Marks: ");
            for (int j = 0; j < studentMarks[i].length; j++) {
                System.out.print(studentMarks[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}