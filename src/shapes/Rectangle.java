package shapes;

public class Rectangle extends Quadrilateral {

    public Rectangle(double length, double width) {

        this.length = length;

        this.width = width;

    }


    ////////////////////////// Abstract Methods /////////////////////////////
    @Override // Notation used to give me an error in case this method doesn't exist else where. Because this method should exist somewhere in the body of the super class. And I wish to overwrite the method contained in the super class.
    public void setLength(double length) {

        this.length = length;

    }

    @Override
    public void setWidth(double width) {

        this.width=width;

    }

    @Override
    public double getPerimeter() {

        double perimeter = (2 * length) + (2 * width);

        return perimeter;

    }

    @Override
    public double getArea() {

        double area = (this.length * this.width);

        return area;

    }

}




















//    ////////// Properties.
//    private float length;
//
//    private float width;
//
//    ////////*/**/*/// Constructor function.
//    public Rectangle(float length, float width) {
//
//        this.length = length;
//
//        this.width = width;
//
//    }
//    ///////// Getters.
//    public float getArea() {
//
//        float area = (length * width);
//
//        return area;
//    }
//
//    public float getPerimeter() {
//
//        float perimeter = (2 * length + 2 * width);
//
//        return perimeter;
//
//    }
//
//    public float getWidth() {
//        return this.width;
//    }
//
//    public float getLength() {
//        return this.length;
//    }
































