package shape.forms.polygons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    public void triangle_correct_values() {
        Assertions.assertDoesNotThrow(() -> {
            Triangle sut = new Triangle(1, 2, 2);
        });
    }

    @Test
    public void triangle_parameter_changed() {
        //given
        Triangle sut = new Triangle(1, 2, 2);
        Assertions.assertEquals(5.0, sut.getCircumference());

        //when
        //parameters get updated on Setter-Call
        sut.setA(2);

        //then
        Assertions.assertEquals(6.0, sut.getCircumference());
    }

    @Test
    public void triangle_change_correct_values() {
        //given
        Triangle sut = new Triangle(5, 5, 5);

        //when
        Assertions.assertDoesNotThrow(() -> {
            sut.setB(7);
        });
    }

    @Test
    public void triangle_invalid_values() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Triangle sut = new Triangle(1, 100, 3);
        });
    }

    @Test
    public void triangle_validation_wrong_values() {
        //given
        Triangle sut = new Triangle(5, 5, 5);

        //then
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> sut.setA(190)
        );
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> sut.setB(190)
        );
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> sut.setC(190)
        );
    }

}