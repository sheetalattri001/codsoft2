import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of grades
        System.out.print("Enter the number of grades: ");
        int numGrades = scanner.nextInt();

        // Initialize variables to store sum and grade values
        double sum = 0.0;
        double grade;

        // Loop to input grades and calculate sum
        for (int i = 1; i <= numGrades; i++) {
            System.out.print("Enter grade " + i + ": ");
            grade = scanner.nextDouble();
            sum += grade;
        }

        // Calculate average
        double average = sum / numGrades;

        // Display the average
        System.out.println("Average grade: " + average);

        // Close the scanner
        scanner.close();
    }
}
