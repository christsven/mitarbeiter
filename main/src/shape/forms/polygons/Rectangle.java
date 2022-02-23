package shape.forms.polygons;

public class Rectangle extends Polygon {

    private double hight;

    // sidelength serves as "length"

    @Override
    protected void calculateArea() {

    }

    //TODO are there other irregular polygons?

    public Rectangle(double hight, double length) throws IllegalAccessException {
        super(length);
        setHight(hight);
        setVertices(4);
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) throws IllegalAccessException {
        if(hight > 0) {
            this.hight = hight;
        } else {
            throw new IllegalAccessException("Hight has to be positive");
        }
    }

    public void setVertices(int vertices) throws IllegalAccessException {
        throw new IllegalAccessException("Rectangle always has four vertices");
    }
}
