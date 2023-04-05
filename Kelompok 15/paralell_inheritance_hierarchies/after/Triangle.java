package paralell_inheritance_hierarchies.after;

public class Triangle extends Shape2D {

    @Override
    public float getArea() {
        return width * height / 2;
    }

}