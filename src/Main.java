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

            System.out.println("Welcome");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            System.out.print("Enter a function: ");
            int input = scanner.nextInt();

            if(input == 4) {
                double a_ = scanner.nextDouble();
                double b_ = scanner.nextDouble();
                System.out.println(a_ + " / " + b_ + " = " + functions.division(a_, b_));
            } else if (input == 3) {
                double a_ = scanner.nextDouble();
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
        }
}