package shape.forms.polygons;


import shape.forms.Shape;

public class Rectangle extends Shape {

    private double hight;

    private double length;

    public Rectangle(double hight, double length) throws IllegalAccessException {
        setSize(hight, length);
        onParametersChanged();
    }

    public double getLength() {
        return length;
    }

    public double getHight() {
        return hight;
    }

    public void setSize(double hight, double length) throws IllegalAccessException {
        if (hight > 0 && length > 0) {
            this.hight = hight;
            this.length = length;
            onParametersChanged();
        } else {
            throw new IllegalAccessException("Hight and Length have to be positive");
        }
    }

    @Override
    protected void onParametersChanged() {
        setArea(length * hight);
    }
}
