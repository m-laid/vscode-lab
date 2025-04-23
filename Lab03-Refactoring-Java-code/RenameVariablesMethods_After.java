public class Calculator {
    public double calculate(double firstOperand, double secondOperand) {
        double sum = firstOperand + secondOperand;
        double product = firstOperand * secondOperand;
        return sum / product;
    }

    public void printResult(double result) {
        System.out.println("Result: " + result);
    }
}
