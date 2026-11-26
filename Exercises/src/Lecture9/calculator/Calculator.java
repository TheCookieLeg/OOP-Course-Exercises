package Lecture9.calculator;

import javax.lang.model.type.ArrayType;

public class Calculator {
    private double accumulator;

    public Calculator() {
        this.accumulator = 0;
    }

    public void doNextOperation(char operator, double operand) {
        switch (operator) {
            case '+':
                add(operand);
                break;
            case '-':
                subtract(operand);
                break;
            case '*':
                multiply(operand);
                break;
            case '/':
                divide(operand);
                break;
            case '^':
                power(operand);
                break;
            case '#':
                squareRoot();
                break;
            case '%':
                reverseSign();
                break;
            case '!':
                inverse();
                break;
            default:
                System.out.println("Invalid operator");
        }
    }


    private void add(double op) { this.accumulator += op; }
    public void subtract(double op) { this.accumulator -= op; }
    public void multiply(double op) { this.accumulator *= op; }
    public void divide(double op) {
        try {
            this.accumulator /= op;
        } catch (ArithmeticException ex) {https://dev.azure.com/AAU-its/Webmanager
            System.out.println("Cannot divide by 0!");
            System.out.println(ex.getMessage());
        }

    }
    public void power(double op) { this.accumulator = Math.pow(this.accumulator, op); }
    public void squareRoot() {
        try  {
            if (this.accumulator < 0) { throw new ArithmeticException("Cannot take square root of negative number"); }
            this.accumulator = Math.sqrt(this.accumulator);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }


    }
    public void reverseSign() { this.accumulator *= -1; }
    public void inverse() {
        try {
            this.accumulator = 1 / this.accumulator;
        } catch (ArithmeticException ex) {
            System.out.println("Cannot divide by 0!");
        }
    }

    public double getAccumulator() { return accumulator; }
}
