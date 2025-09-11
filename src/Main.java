import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
         return a * b;
    }

    public double division(double a, double b) {
         return a / b;
    }
    public static void main(String[] args) {
        Main functions = new Main();
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) { // Loop to allow users to do another function when they completed the last function
            // List of available functions that the users can utilize in the program
            System.out.println("Welcome Please state what function you would like to do.");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            // The scanner to allow the users to select the function they want to utilize
            System.out.print("Enter a function: ");
            int input = scanner.nextInt();

            if (input == 4) {
                System.out.println("Please enter the first number:");
                double a_ = scanner.nextDouble();
                System.out.println("Please enter the second number:");
                double b_ = scanner.nextDouble();
                System.out.println(a_ + " / " + b_ + " = " + functions.division(a_, b_));
            } else if (input == 3) {
                System.out.println("Please enter the first number:");
                double a_ = scanner.nextDouble();
                System.out.println("Please enter the second number:");
                double b_ = scanner.nextDouble();
                System.out.println(a_ + " * " + b_ + " = " + functions.multiplication(a_, b_));
            } else if (input == 2) {
                System.out.println("Please enter the first number: ");
                double a_ = scanner.nextDouble();
                System.out.println("Please enter the second number: ");
                double b_ = scanner.nextDouble();
                System.out.println(a_ + " - " + b_ + " = " + functions.subtraction(a_, b_));
            } else {
                System.out.println("Please enter the first number:");
                double a_ = scanner.nextDouble();
                System.out.println("Please enter the second number: ");
                double b_ = scanner.nextDouble();
                System.out.println(a_ + " + " + b_ + " = " + functions.addition(a_, b_));
            }
            /* Input to allow for the looping of the calculator to see if the user wants to do another function
            or not "n" will end the loop and "y" or anything else will continue the loop. */
            System.out.println("Would you like to make another calculation (y/n)?");
            String answer = scanner.next();
            if (answer.equals("n")) {
                loop = false;
            }
        }
    }
}