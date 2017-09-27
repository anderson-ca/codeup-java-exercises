package shapes;

public class Circle {
    private double radius;
    double pi = Math.PI;

    // Constructor setting the class for radius.
    public Circle(double radius) {

        this.radius = radius;
    }

    // Method used to get the area of a circle.
    public double getArea() {

        return (pi * (radius * radius));
    }


    public double getCircumference() {

        return (2 * pi * radius);
    }

}
