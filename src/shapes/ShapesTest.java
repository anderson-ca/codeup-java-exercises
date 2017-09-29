package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape = new Rectangle(4, 5);

        Measurable otherShape = new Square(5);

        System.out.println("Rectangle area: " + myShape.getArea() + "\nRectangle perimeter: " + myShape.getPerimeter());

        System.out.println("Square area: " + otherShape.getArea() + "\nSquare perimeter: " + otherShape.getPerimeter());


    }
}
