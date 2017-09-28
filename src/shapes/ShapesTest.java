package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(4, 5);

        Rectangle box2 = new Square(5);


        ////////// Box1
        System.out.println("Box 1\nPerimeter: " + box1.getPerimeter());

        System.out.println("Area: " + box1.getArea());


        ///////// Box2
        System.out.println("Box 2\nPerimeter: " + box2.getPerimeter());

        System.out.println("Area: " + box2.getArea());

    }
}
