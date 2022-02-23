package shape.forms.polygons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import shape.Calculator;

class RegularPolygonTest {
    //TODO test korrekte berechung aller werte
    @Test
    public void test_regular_polygon_setters_work_correctly() {
        //given
        double sidelength = 10;
        int vertices = 8;
        
        //when
        RegularPolygon sud = new RegularPolygon(sidelength, vertices);
        
        //then
        Assertions.assertEquals(
                sidelength,
                sud.getSidelength());
        Assertions.assertEquals(
                vertices,
                sud.getVertices());
        Assertions.assertEquals(
                Calculator.calculateInnerCircle(
                        sidelength,
                        vertices),
                sud.getInnerCircle());
        Assertions.assertEquals(
                Calculator.calculateOuterCircle(
                        sidelength,
                        vertices),
                sud.getOuterCircle());

    }
    //TODO test korrektes updaten aller werte bei setteraufruf
    @Test
    public void test_regular_polygon_onParametersChanged() {

    }
}