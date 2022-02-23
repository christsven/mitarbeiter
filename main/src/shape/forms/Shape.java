package shape.forms;

public abstract class Shape {

    private double area;

    public Shape() {

    }

    public double getArea() {
        return area;
    }

    /**
     * is to be implemented for child classes as method
     * to calculate the area from the given parameters
     * of each shape.
     */
    protected abstract void calculateArea();
}
