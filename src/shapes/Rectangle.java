package shapes;

public class Rectangle {

    ////////// Properties.
    private float length;

    private float width;

    ///////// Constructor function.
    public Rectangle(float length, float width) {

        this.length = length;

        this.width = width;

    }
    ///////// Getters.
    public float getArea() {

        float area = (length * width);

        return area;
    }

    public float getPerimeter() {

        float perimeter = (2 * length + 2 * width);

        return perimeter;

    }

    public float getWidth() {
        return this.width;
    }

    public float getLength() {
        return this.length;
    }

}
