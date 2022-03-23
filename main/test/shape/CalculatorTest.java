package shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    public void test_heron_formula_calculates_correctly() {
        //given
        double a = 110;
        double b = 150;
        double c = 130;

        //when
        double result = Calculator.calculateTriangleAreaHeronFormula(
                a,
                b,
                c);

        //then
        Assertions.assertEquals(6963, result);
    }

    @Test
    public void test_calculates_inner_circle_correctly() {
        //given
        int vertices = 10;
        double area = 200;
        //when
        double result = Calculator.calculateRadiusInnerCircle(
                area,
                vertices);
        //then
        Assertions.assertEquals(308, result);
    }

    @Test
    public void test_calculates_outer_circle_correctly() {
        //given
        int vertices = 10;
        double area = 200;
        //when
        double result = Calculator.calculateRadiusOuterCircle(
                area,
                vertices);
        //then
        Assertions.assertEquals(324, result);
    }


}