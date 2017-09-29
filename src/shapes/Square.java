package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {

        super(side, side);

    }

    /////////////////////////////// Abstract Methods ////////////////////////////////////
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = length;
    }

    @Override
    public double getPerimeter() {
        double perimeter = (4 * this.width);

        return perimeter;
    }

    @Override
    public double getArea() {
        double area = (this.length * this.width);

        return  area;
    }
}
























//    //////////// Constructor.
//    public Square(float side) {
//
//        super(side, side);
//
//    }
//
//    //////////// Getters
//    public float getArea() {
//
//        float area = super.getWidth() * super.getWidth();
//
//        return area;
//
//    }
//
//    public float getPerimeter() {
//
//        float perimeter = (4 * super.getWidth());
//
//        return perimeter;
//
//    }




















