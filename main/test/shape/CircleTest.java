package shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    public void test_calculates_inner_circle_correctly() {
        //given
        int vertices = 10;
        double area = 200;
        //when
        double result = Circle.calculateRadiusInnerCircle(
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
        double result = Circle.calculateRadiusOuterCircle(
                area,
                vertices);
        //then
        Assertions.assertEquals(324, result);
    }

}