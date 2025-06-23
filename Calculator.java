import java.util.Scanner;

public class Calculator {

    // Addition
    int add(int a, int b) {
        return a + b;
    }

    // Subtraction
    int sub(int a, int b) {
        return a - b;
    }

    // Multiplication
    int mult(int a, int b) {
        return a * b;
    }

    // Division
    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error:- Division by zero is not allowed");
            return Double.NaN;
        }
        return (double) a / b;
    }

    // Start Calculator
    public void start() {
        Scanner sc = new Scanner(System.in);
        boolean continueCalc = true;

        System.out.println("----->>>>> My Calculator <<<<<-----");

        while (continueCalc) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting Calculator. Thank you!");
                break;
            }

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + sub(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + mult(num1, num2));
                    break;
                case 4:
                    System.out.println("Result: " + divide(num1, num2));
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.start();
    }
}
