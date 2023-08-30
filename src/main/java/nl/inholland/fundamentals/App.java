package nl.inholland.fundamentals;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.printf("%s %d%n", name, age);
        scanner.close();
    }

    public String printGreeting(String name) {
        return "Hello " + name;
    }
}
