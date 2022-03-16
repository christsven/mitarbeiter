package shape.forms.polygons;

import shape.Calculator;
import shape.forms.AbstractShape;

public class Triangle extends AbstractShape {

    private double a;
    private double b;
    private double c;
    private double circumference;

    public Triangle(double sideA, double sideB, double sideC) {
        if (!valideSidelengths(sideA, sideB, sideC)) {
            throw new IllegalArgumentException("Lengths are invalid");
        }
        a = sideA;
        b = sideB;
        c = sideC;
        onParametersChanged();
    }

    @Override
    protected void onParametersChanged() {
        setArea(Calculator.calculateTriangleAreaHeronFormula(a, b, c));
        setCircumference(a + b + c);
    }

    /**
     * calculates if three given sides can be connected to a triangle
     *
     * @return if a triangle can be created with the given sidelengths
     */
    private static boolean valideSidelengths(double a, double b, double c) {
        return a + b > c
                && a + c > b
                && b + c > a;
    }

    public void setA(double sideA) {
        if (valideSidelengths(sideA, b, c)) {
            this.a = sideA;
            onParametersChanged();
        } else {
            throw new IllegalArgumentException(String.format(
                    "Sidelength %s doesnt work with sides %s, %s",
                    sideA,
                    b,
                    c));
        }
    }

    public void setB(double sideB) {
        if (valideSidelengths(a, sideB, c)) {
            this.b = sideB;
            onParametersChanged();
        } else {
            throw new IllegalArgumentException(String.format(
                    "Sidelength %s doesnt work with sides %s, %s",
                    sideB,
                    a,
                    c));
        }
    }

    public void setC(double sideC) {
        if (valideSidelengths(a, b, sideC)) {
            this.c = sideC;
            onParametersChanged();
        } else {
            throw new IllegalArgumentException(String.format(
                    "Sidelength %s doesnt work with sides %s, %s",
                    sideC,
                    b,
                    a));
        }
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getCircumference() {
        return circumference;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
