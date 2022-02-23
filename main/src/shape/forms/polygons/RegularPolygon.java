package shape.forms.polygons;

import shape.Calculator;
import shape.forms.Circle;

public class RegularPolygon extends Polygon {

    private Circle innerCircle;

    private Circle outerCircle;

    //number of sides, e. g. triangle = 3, rectangle = 4, octagon = 8
    private int vertices;


    public RegularPolygon(double sidelength, int vertices) {
        super(sidelength);
        setVertices(vertices);
        calculateInnerCircle();
        calculateOuterCircle();
    }

    public Circle getInnerCircle() {
        return innerCircle;
    }

    private void calculateInnerCircle() {
        //TODO wie berechnet man den radius aus den gegebenen formeln?
        Circle circle = new Circle();
    }

    public Circle getOuterCircle() {
        return outerCircle;
    }

    private void calculateOuterCircle() {
        //TODO wie berechnet man den radius aus den gegebenen formeln?
        Circle circle = new Circle();
    }

    public int getVertices() {
        return vertices;
    }

    public void setVertices(int vertices) {
        if (vertices > 0) {
            this.vertices = vertices;
        } else {
            throw new IllegalArgumentException("We need at least 3 vertices to a two dimensional shape");
        }
    }

    @Override
    protected void calculateArea() {

    }
}
