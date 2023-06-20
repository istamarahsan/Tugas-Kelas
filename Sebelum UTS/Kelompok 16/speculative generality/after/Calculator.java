public class Calculator {
    public static void add(double num1, double num2) {
        System.out.println(num1 + num2);
    }
    public static void subtract(double num1, double num2) {
        System.out.println(num1 - num2);
    }
    public static void multiply(double num1, double num2) {
        System.out.println(num1 * num2);
    }
    public static void divide(double num1, double num2) {
        System.out.println(num1 / num2);
    }
    public static void modulo(double num1, double num2) {
        System.out.println(num1 % num2);
    }
    public static void main(String[] args) {
        Calculator.add(10, 5); 
        Calculator.subtract(10, 5); 
        Calculator.multiply(10, 5); 
        Calculator.divide(10, 5); 
        Calculator.modulo(10, 5); 
        
    }
}
