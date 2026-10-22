
public class Day08LoopsPractice {
    public static void main(String[] args) {

        // 1. Print 1 to 10
        System.out.println("1. Numbers 1 to 10");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 2. Print 10 to 1
        System.out.println("2. Reverse Counting");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 3. Even numbers
        System.out.println("3. Even Numbers");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 4. Odd numbers
        System.out.println("4. Odd Numbers");
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 5. Table of 7
        System.out.println("5. Table of 7");
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }

        // 6. Sum from 1 to 10
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("\n6. Sum = " + sum);

        // 7. Factorial of 5
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("7. Factorial = " + factorial);

        // 8. While loop
        System.out.println("\n8. While Loop");
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // 9. Do-while loop
        System.out.println("\n9. Do-While Loop");
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 5);
        System.out.println();

        // 10. Break example
        System.out.println("\n10. Break Example");
        for (int k = 1; k <= 10; k++) {
            if (k == 6) {
                break;
            }
            System.out.print(k + " ");
        }
        System.out.println();

        // 11. Continue example: skip 5
        System.out.println("\n11. Continue Example");
        for (int k = 1; k <= 10; k++) {
            if (k == 5) {
                continue;
            }
            System.out.print(k + " ");
        }
        System.out.println();

        // 12. Multiples of 3
        System.out.println("\n12. Multiples of 3");
        for (int k = 3; k <= 30; k += 3) {
            System.out.print(k + " ");
        }
        System.out.println();

        // 13. Nested loop: square pattern
        System.out.println("\n13. Square Pattern");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 14. Increasing triangle
        System.out.println("\n14. Triangle Pattern");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 15. Decreasing triangle
        System.out.println("\n15. Reverse Triangle");
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
