package shape.forms;

public class Circle extends Shape {

    private double circumference;

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        onParametersChanged();
    }

    public double getCircumference() {
        return circumference;
    }

    private void setCircumference(double circumference) {
        if(circumference > 0) {
            this.circumference = circumference;
        } else {
            throw new IllegalArgumentException(String.format("Circumference cant be negative: %s", circumference));
        }
    }

    private void calculateCircumference() {
        setCircumference(2 * Math.PI * getRadius());
    }

    @Override
    protected void onParametersChanged() {
        setArea(Math.PI * getRadius() * getRadius());
        calculateCircumference();
    }
}
