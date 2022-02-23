package shape.forms.polygons;

import shape.Calculator;
import shape.forms.Circle;
import shape.forms.Shape;

public class RegularPolygon extends Shape {

    private Circle innerCircle;

    private Circle outerCircle;

    //number of sides, e. g. triangle = 3, rectangle = 4, octagon = 8
    private int vertices;

    private double sidelength;

    public double getSidelength() {
        return sidelength;
    }

    public void setSidelength(double sidelength) {
        if(sidelength > 0) {
            this.sidelength = sidelength;
            calculateArea();
        } else {
            throw new IllegalArgumentException("Has to be positive.");
        }
    }

    public RegularPolygon(double sidelength, int vertices) {
        setVertices(vertices);
        calculateArea();
    }

    public Circle getInnerCircle() {
        return innerCircle;
    }

    public Circle getOuterCircle() {
        return outerCircle;
    }

    private void setInnerCircle(Circle innerCircle) {
        this.innerCircle = innerCircle;
    }

    private void setOuterCircle(Circle outerCircle) {
        this.outerCircle = outerCircle;
    }

    public int getVertices() {
        return vertices;
    }

    public void setVertices(int vertices) {
        if (vertices >= 3) {
            this.vertices = vertices;
            calculateArea();
        } else {
            throw new IllegalArgumentException("We need at least 3 vertices to a two dimensional shape");
        }
    }

    @Override
    protected void calculateArea() {
        setArea(getVertices() - 2 * Calculator.calculateTriangleAreaHeronFormula(
                getSidelength(),
                getSidelength(),
                getSidelength())
        );
        setInnerCircle(
                new Circle(Calculator.calculateInnerCircle(
                        getArea(),
                        getVertices())));
        setOuterCircle(
                new Circle(Calculator.calculateOuterCircle(
                        getArea(),
                        getVertices())));
    }
}