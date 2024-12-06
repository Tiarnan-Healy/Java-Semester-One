package Week1;

/* Copied this from my own GitHub as I've lost the original files and folders
 *
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
// https://github.com/Tiarnan-Healy/CalculatorJava.git
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;

        num1 = inputFirstNum(num1, scanner);
        menu(scanner, num1);
    }

    // Input method
    public static double inputFirstNum(double num1, Scanner scanner) {
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();
        return num1;
    }

    public static double inputSecondNum(Scanner scanner) {
        System.out.print("Enter the second number: ");
        return scanner.nextDouble();

    }

    // Addition method
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction method
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    // Division method
    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    // Multiplication method
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }


    // Square method
    public static double square(double num1) {
        return num1 * num1; }

    //Cube method
    public static double cube(double num1) {
        return num1 * num1 * num1;
    }

    // Square root method
    public static double squareRoot(double num1) {
        num1 = Math.sqrt(num1);
        return num1;
    }

    // Power method
    public static double power(double num1, double num2) {
        for (int i = 0; i < num2; i++) {
            num1 = num1 * num1;
        }
        return num1;
    }

    // Factorial method
    public static double factorial(double num1) {
        double result = 1;
        for (int i = 1; i <= num1; i++) {
            result *= i;
        }
        return result;
    }

    // Sine method
    public static double sin(double num1) {
        num1 = Math.sin(num1);
        return num1;
    }

    // Cosine method
    public static double cos(double num1) {
        num1 = Math.cos(num1);
        return num1;
    }

    // Tan method
    public static double tan(double num1) {
        num1 = Math.tan(num1);
        return num1;
    }

    // Quit method
    public static void quit() {
        System.out.println("Goodbye!");
        System.exit(0);
    }

    // Print method
    public static void print(double answer, Scanner scanner) {
        System.out.println("The result is: " + answer);
        System.out.println("Press enter to continue...");
        scanner.nextLine();
        scanner.nextLine();
    }

    // Menu method
    public static void menu(Scanner scanner, double num1){
        double answer = num1;
        while (true) {

            System.out.println("Please select an option:\n");
            System.out.println("Addition(1)\t\t\tPower(7)");
            System.out.println("Subtraction(2)\t\tFactorial(8)");
            System.out.println("Multiplication(3)\tSquare Root(9)");
            System.out.println("Division(4)\t\t\tSin(10)");
            System.out.println("Square(5)\t\t\tCos(11)");
            System.out.println("Cube(6)\t\t\t\tTan(12)");
            System.out.println("Reset(r)");
            System.out.println("\nQuit(0)\n");
            System.out.println(answer + "\n");
            System.out.print("Enter your choice: ");
            String choice = scanner.next();

            switch (choice) {
                case "1": // Addition
                    double num2 = inputSecondNum(scanner);
                    answer = addition(answer, num2);
                    print(answer, scanner);
                    break;
                case "2": // Subtraction
                    num2 = inputSecondNum(scanner);
                    answer = subtraction(answer, num2);
                    print(answer, scanner);
                    break;
                case "3": // Multiplication
                    num2 = inputSecondNum(scanner);
                    answer = multiplication(answer, num2);
                    print(answer, scanner);
                    break;
                case "4": // Division
                    num2 = inputSecondNum(scanner);
                    if (num2 != 0) {
                        answer = division(answer, num2);
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                    }
                    print(answer, scanner);
                    break;
                case "5": // Square
                    answer = square(answer);
                    print(answer, scanner);
                    break;
                case "6": // Cube
                    answer = cube(answer);
                    print(answer, scanner);
                    break;
                case "7": // Power of own choosing
                    num2 = inputSecondNum(scanner);
                    answer = power(answer, num2);
                    print(answer, scanner);
                    break;
                case "8": // Factorial
                    answer = factorial(answer);
                    print(answer, scanner);
                    break;
                case "9": // Square root
                    answer = squareRoot(answer);
                    print(answer, scanner);
                    break;
                case "10": // Sine
                    answer = sin(answer);
                    print(answer, scanner);
                    break;
                case "11": // Cosine
                    answer = cos(answer);
                    print(answer, scanner);
                    break;
                case "12": // Tan
                    answer = tan(answer);
                    print(answer, scanner);
                    break;
                case "r": // Reset
                    num1 = inputFirstNum(0, scanner);  // Reset with new num1
                    answer = num1;
                    break;
                case "0": // Quit
                    quit();
                    System.exit(0);
                default:
                    System.out.println("\nInvalid option, please input again.\n");
            }
        }
    }
}
