class Main {
    public static void main(String[] args) {
        // initializing variables
        int squareSide = 7;
        int rectangleWidth = 8;
        int rectangleHeight = 3;
        int circleRadius = 10;

        // getting areas
        calc(shapeType.square, squareSide, 0);
        calc(shapeType.rectangle, rectangleWidth, rectangleHeight);
        calc(shapeType.circle, circleRadius, 0);
    }

    public static void calc(shapeType type, int side, int width) {
        int area = 0;
    
        if (type == shapeType.square) {
            area = side * side;
        } else if (type == shapeType.rectangle) {
            area = side * width;
        } else if (type == shapeType.circle) {
            area = (int)(3.14 * side * side);
        }
    
        // prints out the area for user
        System.out.println("Area of " + type.ordinal() + " : " + area);
    }
}
