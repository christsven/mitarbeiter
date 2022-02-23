package shape.forms;

public abstract class Shape {

    double area;

    public Shape() {
    }

    public double getArea() {
        return area;
    }

    protected void setArea(double area) {
        this.area = area;
    }

    /**
     * is to be implemented for child classes as method
     * to calculate the area from the given parameters
     * of each shape.
     */
    protected abstract void calculateArea();
}
