import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.println("Menu\n========");
            System.out.println("1. Calculate Rectangle Area");
            System.out.println("2. Calculate Square Area");
            System.out.println("3. Calculate Circle Area");
            System.out.println("0. Exit");
            System.out.print("Input: ");
    
            input = scanner.nextInt();
            if (input == 1) {
        
                System.out.print("Enter width: ");
                int width = scanner.nextInt();
                System.out.print("Enter height: ");
                int height = scanner.nextInt();
                System.out.println("Area of rectangle: " + calculateAreaRectangle(width, height));
            } else if (input == 2) {
                System.out.print("Enter side length: ");
                int side = scanner.nextInt();
                System.out.println("Area of square: " + calculateAreaSquare(side));
            } else if (input == 3) {
                System.out.print("Enter radius: ");
                double radius = (double) scanner.nextInt();
                System.out.println("Area of circle: " +  calculateAreaCircle(radius));
            }
        } while (input != 0);
    
        scanner.close();
    }

    public static int calculateAreaSquare(int side){
        int hasil = side * side;

        return hasil;
    }
    public static int calculateAreaRectangle(int width, int height){
        int hasil = width * height;

        return hasil;
    }
    public static double calculateAreaCircle(double radius){
        double hasil = 3.14 * radius * radius;

        return hasil;
    }
}