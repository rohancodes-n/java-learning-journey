 
import java.util.Arrays;

public class Day09 {
    public static void main(String[] args) {

        // 1. Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("1. Array Elements:");
        System.out.println(Arrays.toString(numbers));

        // 2. Access array elements
        System.out.println("\n2. Access Elements:");
        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);

        // 3. Find array length
        System.out.println("\n3. Array Length:");
        System.out.println(numbers.length);

        // 4. Print all elements using for loop
        System.out.println("\n4. Print All Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 5. Print elements using enhanced for loop
        System.out.println("\n5. Enhanced For Loop:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 6. Find sum of array elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\n6. Sum = " + sum);

        // 7. Find average
        double average = (double) sum / numbers.length;
        System.out.println("7. Average = " + average);

        // 8. Find maximum element
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("\n8. Maximum = " + max);

        // 9. Find minimum element
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("9. Minimum = " + min);

        // 10. Print array in reverse order
        System.out.println("\n10. Reverse Order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // 11. Search for an element
        int target = 30;
        boolean found = false;

        for (int num : numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }

        System.out.println("\n11. Search " + target + ": " + found);

        // 12. Update an array element
        numbers[1] = 25;
        System.out.println("\n12. Updated Array:");
        System.out.println(Arrays.toString(numbers));

        // 13. Count even and odd elements
        int even = 0;
        int odd = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("\n13. Even count = " + even);
        System.out.println("Odd count = " + odd);

        // 14. Copy array elements into another array
        int[] copy = Arrays.copyOf(numbers, numbers.length);

        System.out.println("\n14. Copied Array:");
        System.out.println(Arrays.toString(copy));

        // 15. Sort the array
        Arrays.sort(numbers);

        System.out.println("\n15. Sorted Array:");
        System.out.println(Arrays.toString(numbers));
    }
}


