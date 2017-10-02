package shapes;
//My super class is abstract because its concepts bleeds into the sub-classes.
abstract public class Quadrilateral implements Measurable {

    ///////////// Properties. ///////////////////////
    protected double length;

    protected double width;

    //////////// Constructor. //////////////////////
    public Quadrilateral(double length, double width) {

        this.length = length;

        this.width = width;

    }

    public Quadrilateral() {

    }

    //////////// Getters. //////////////////////
    public double getLength() {

        return this.length;

    }

    public double getWidth() {

        return this.width;

    }

    // the Setters are abstract methods because I wish to give more freedom to the sub-classes when these methods are being defined in the sub-classes. For this reason i don't define them in the body of the super class. Instead, I will defined these methods in the body of whatever sub-class I'm using these methods in.
    ///////////// Setters. /////////////////////////
    public abstract void setLength(double length);

    public abstract void setWidth(double width);

}
