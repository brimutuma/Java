/*
Author: Brian Mutuma
Purpose: To compute the mathematical operations +, -, *, %, /, using if... else conditional statements
 */
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double number1, number2, result;
        char operator;

        System.out.print("Enter first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, %, /): ");
        operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        number2 = input.nextDouble();

        if (operator == '+') {
            result = number1 + number2;
        } else if (operator == '-') {
            result = number1 - number2;
        } else if (operator == '*') {
            result = number1 * number2;
        } else if (operator == '%') {
            result = number1 % number2;
        } else if (operator == '/') {
            if (number2 != 0) {
                result = number1 / number2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return;
            }
        } else {
            System.out.println("Error: Invalid operator.");
            return;
        }

        System.out.println("Result: " + result);
    }
}