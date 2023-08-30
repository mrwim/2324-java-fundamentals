package nl.inholland.fundamentals;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the size of your group and press [ENTER]: ");

        int groupSize = Integer.parseInt(scanner.nextLine());

        System.out.println("Group size: " + groupSize);

        System.out.println();

        Student[] students = new Student[groupSize];

        for (int i = 0; i < groupSize; i++) {
            System.out.printf("Please enter the name of student #%d and press [ENTER]: ", i + 1);
            String name = scanner.nextLine();
            Student student = new Student();
            student.name = name;
            students[i] = student;
        }

        System.out.println();

        for (int i = 0; i < students.length; i++) {
            System.out.printf("Student #%d: %s%n", i + 1, students[i].name);
        }

        System.out.println();

        for (int i = 0; i < students.length; i++) {
            System.out.printf("Is Student #%d (%s) present? [Y/N + ENTER]: ", i + 1, students[i].name);
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                students[i].isPresent = true;
            }
        }

        System.out.println();
        for (int i = 0; i < students.length; i++) {
            System.out.printf("Student #%d: %-15s| Present: %b%n", i + 1, students[i].name, students[i].isPresent);
        }


    }

    public String printGreeting(String name) {
        return "Hello " + name;
    }
}
