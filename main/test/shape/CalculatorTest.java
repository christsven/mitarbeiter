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
        double expectedresult = 6963;

        //when
        double result = Calculator.calculateTriangleAreaHeronFormula(
                a,
                b,
                c);

        //then
        Assertions.assertEquals(expectedresult, result);
    }


}