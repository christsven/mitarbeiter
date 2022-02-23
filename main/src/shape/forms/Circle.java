package shape.forms;

public class Circle {

    private double circumference;

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
        calculateCircumference();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        calculateCircumference();
    }

    public double getCircumference() {
        return circumference;
    }

    private void calculateCircumference() {
        //TODO calculates Circumference
    }

}
