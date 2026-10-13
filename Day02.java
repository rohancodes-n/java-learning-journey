public class Day02{
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT RESULT SYSTEM =====");

        // Integer inputs
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println("Enter English marks:");
        int english = sc.nextInt();

        System.out.println("Enter Maths marks:");
        int maths = sc.nextInt();

        System.out.println("Enter Computer marks:");
        int computer = sc.nextInt();

        // Character input
        System.out.println("Enter your grade (A/B/C):");
        char grade = sc.next().charAt(0);

        // Calculations
        int total = english + maths + computer;
        double percentage = total / 300.0 * 100;

        // Type casting
        int roundedPercentage = (int) percentage;

        // Conditions using boolean and logical operators
        boolean passed = english >= 35
                && maths >= 35
                && computer >= 35;

        boolean prizeEligible = percentage >= 90 && passed;

        // Final report
        System.out.println("\n===== YOUR REPORT =====");
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Total Marks: " + total + "/300");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Rounded Percentage: " + roundedPercentage + "%");
        System.out.println("Passed All Subjects: " + passed);
        System.out.println("Prize Eligible: " + prizeEligible);

        sc.close();
    }
}
 {
    
}
