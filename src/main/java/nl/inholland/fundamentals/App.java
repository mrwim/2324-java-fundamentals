package nl.inholland.fundamentals;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();

        System.out.print("Enter number of students: ");

        // Is a bit of a hack, because nextInt doesn't take the newline character, and it will be read by the nextLine call.
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        System.out.println();

        String[] students = new String[numberOfStudents];
        int[] grades = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            students[i] = scanner.nextLine();
        }

        System.out.println();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter grade of " + students[i] + ": ");
            grades[i] = scanner.nextInt();
        }

        System.out.println();

        System.out.printf("Average grade: %.2f%n", calculateAverage(grades));

        int studentNumberWithHighestGrade = getStudentNumberWithHighestGrade(grades);
        String qualifier = grades[studentNumberWithHighestGrade] == 100 ? "maximum" : "highest";
        System.out.printf("Student %s has the %s grade: %d%n", students[studentNumberWithHighestGrade], qualifier, grades[studentNumberWithHighestGrade]);

        System.out.println();

        for (int i = 0; i < students.length; i++) {
            System.out.printf("Grade for student %s (Course %s): %d%n", students[i], courseName, grades[i]);
        }

        scanner.close();
    }

    private static double calculateAverage(int[] grades) {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    private static int getStudentNumberWithHighestGrade(int[] grades) {
        int highestGrade = 0;
        int index = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > highestGrade) {
                highestGrade = grades[i];
                index = i;
            }
        }
        return index;
    }

    public String printGreeting(String name) {
        return "Hello " + name;
    }
}
