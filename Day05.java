
import java.util.Scanner;

public class Day05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("       JAVA DAY 05 PRACTICE");
        System.out.println("==================================");

        // 1. Take user details
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("\nHello, " + name + "!");

        // 2. Check voting eligibility
        System.out.println("\n--- Voting Eligibility ---");

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // 3. Check even or odd
        System.out.println("\n--- Even or Odd ---");

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }

        // 4. Check positive, negative or zero
        System.out.println("\n--- Number Checking ---");

        if (num > 0) {
            System.out.println("Positive number");
        } else if (num < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Number is zero");
        }

        // 5. Find the greatest of three numbers
        System.out.println("\n--- Greatest of Three Numbers ---");

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a + " is the greatest.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the greatest.");
        } else {
            System.out.println(c + " is the greatest.");
        }

        // 6. Student grading system
        System.out.println("\n--- Student Grade ---");

        System.out.print("Enter marks out of 100: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks.");
        } else if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else if (marks >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // 7. Simple calculator using switch
        System.out.println("\n--- Calculator ---");

        System.out.print("Enter first number: ");
        double x = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double y = sc.nextDouble();

        switch (operator) {
            case '+':
                System.out.println("Result: " + (x + y));
                break;

            case '-':
                System.out.println("Result: " + (x - y));
                break;

            case '*':
                System.out.println("Result: " + (x * y));
                break;

            case '/':
                if (y != 0) {
                    System.out.println("Result: " + (x / y));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;

            default:
                System.out.println("Invalid operator.");
        }

        // 8. Multiplication table
        System.out.println("\n--- Multiplication Table ---");

        System.out.print("Enter a number: ");
        int table = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(
                table + " x " + i + " = " + (table * i)
            );
        }

        // 9. Sum of numbers from 1 to N
        System.out.println("\n--- Sum of Natural Numbers ---");

        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        if (n > 0) {
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }

            System.out.println("Sum = " + sum);
        } else {
            System.out.println("Please enter a positive number.");
        }

        // 10. String methods
        System.out.println("\n--- String Methods ---");

        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        System.out.println("Original: " + text);
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Length: " + text.length());
        System.out.println("Replace spaces: "
                + text.replace(" ", "_"));

        // 11. Check whether a number is divisible by 5 and 3
        System.out.println("\n--- Divisibility Check ---");

        System.out.print("Enter a number: ");
        int value = sc.nextInt();

        if (value % 3 == 0 && value % 5 == 0) {
            System.out.println("Divisible by both 3 and 5.");
        } else if (value % 3 == 0) {
            System.out.println("Divisible by 3 only.");
        } else if (value % 5 == 0) {
            System.out.println("Divisible by 5 only.");
        } else {
            System.out.println("Not divisible by 3 or 5.");
        }

        // 12. Print a star pattern
        System.out.println("\n--- Star Pattern ---");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n==================================");
        System.out.println("     DAY 05 PRACTICE COMPLETED");
        System.out.println("==================================");

        sc.close();
    }
}

