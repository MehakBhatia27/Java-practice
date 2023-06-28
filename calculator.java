public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return num1 + num2;
    }

    public int subtract() {
        return num1 - num2;
    }

    public int multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return (double) num1 / num2;
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 5);
        System.out.println("Addition: " + calculator.add());
        System.out.println("Subtraction: " + calculator.subtract());
        System.out.println("Multiplication: " + calculator.multiply());
        System.out.println("Division: " + calculator.divide());
    }
}
