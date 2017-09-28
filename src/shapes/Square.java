package shapes;

public class Square extends Rectangle {


    //////////// Constructor.
    public Square(float side) {

        super(side, side);

    }

    //////////// Getters
    public float getArea() {

        float area = (4 * super.getWidth());

        return area;

    }

    public float getPerimeter() {

        float perimeter = super.getWidth() * super.getWidth();

        return perimeter;

    }

}
