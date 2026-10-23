public class Day10 {



    // 1. Method without parameters and without return value
    static void greet() {
        System.out.println("Hello, Welcome to Java Methods!");
    }

    // 2. Method with parameters and without return value
    static void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    // 3. Method without parameters but with return value
    static int getNumber() {
        return 100;
    }

    // 4. Method with parameters and with return value
    static int multiply(int a, int b) {
        return a * b;
    }

    // 5. Method to check even or odd
    static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    public static void main(String[] args) {

        greet();

        add(10, 20);

        int number = getNumber();
        System.out.println("Returned Number: " + number);

        int result = multiply(5, 4);
        System.out.println("Multiplication: " + result);

        checkEvenOdd(7);
    }
}

}
