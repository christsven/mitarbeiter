package shape.forms;

public class Circle extends Shape {

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
        calculateArea();
        calculateCircumference();
    }

    public double getCircumference() {
        return circumference;
    }

    private void setCircumference(double circumference) {
        if(circumference > 0) {
            this.circumference = circumference;
        } else {
            throw new IllegalArgumentException("Circumference cant be negative.");
        }
    }

    private void calculateCircumference() {
        setCircumference(2 * Math.PI * getRadius());
    }

    @Override
    protected void calculateArea() {
        setArea(Math.PI * getRadius() * getRadius());
    }
}
