package shape;

public class Calculator {

    /**
     * calculates the radius of the outer circle of a regular polygon.
     *
     * @param a = area of polygon
     * @param n = vertices
     * @return radius
     */
    public static double calculateRadiusInnerCircle(double a, int n) {
        return Math.round(a / (2 * Math.tan(Math.PI / n)));
    }

    /**
     * calculates the radius of the outer circle of a regular polygon.
     *
     * @param a = area of polygon
     * @param n = vertices
     * @return radius
     */
    public static double calculateRadiusOuterCircle(double a, int n) {
        return Math.round(a / (2 * Math.sin(Math.PI / n)));
    }

    /**
     * calculates the area of a triangle given by its three sides.
     *
     * @param a,b,c = the three sides of the triangle
     * @return the area of the given triangle
     */
    public static double calculateTriangleAreaHeronFormula(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.round(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }
}
