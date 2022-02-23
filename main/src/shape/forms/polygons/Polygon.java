package shape.forms.polygons;

import shape.forms.Shape;

public abstract class Polygon extends Shape {

    private double sidelength;

    /**
     * calculates area from sidelength and vertices
     * @param sidelength length of a side
     */
    public Polygon(double sidelength) {
        calculateArea();
        setSidelength(sidelength);
    }


    public double getSidelength() {
        return sidelength;
    }

    public void setSidelength(double sidelength) {
        this.sidelength = sidelength;
    }

}
