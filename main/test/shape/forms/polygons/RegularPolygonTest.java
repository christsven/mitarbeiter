package shape.forms.polygons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import shape.forms.Circle;

class RegularPolygonTest {

    @Test
    public void test_regular_polygon_calculates_correct_area() {
        int vertices = 3;
        double sidelength = 2;

        RegularPolygon sut = new RegularPolygon(sidelength, vertices);

        Assertions.assertEquals(Triangle.calculateTriangleAreaHeronFormula(sidelength, sidelength, sidelength), sut.getArea());
    }

    @Test
    public void test_regular_polygon_setters_work_correctly() {
        //given
        double sidelength = 10;
        int vertices = 5;
        
        //when
        RegularPolygon sut = new RegularPolygon(sidelength, vertices);
        
        //then
        Assertions.assertEquals(
                sidelength,
                sut.getSidelength());
        Assertions.assertEquals(
                vertices,
                sut.getVertices());

        //werden werte innerhalb der Klasse korrekt an den Calculator übergeben?
        Assertions.assertEquals(
                Circle.calculateRadiusInnerCircle(
                        calculateArea(sidelength, vertices),
                        vertices),
                sut.getInnerCircle().getRadius());

        Assertions.assertEquals(
                Circle.calculateRadiusOuterCircle(
                        calculateArea(sidelength, vertices),
                        vertices),
                sut.getOuterCircle().getRadius());
    }

    private double calculateArea(double sidelength, int vertices) {
        return (vertices - 2) * Triangle.calculateTriangleAreaHeronFormula(
                sidelength,
                sidelength,
                sidelength);
    }
}