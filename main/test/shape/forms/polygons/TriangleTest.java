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
        double before = sut.getCircumference();
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
    public void triangle_change_correct_values_to_invalid_values() {
        //given
        Triangle sut = new Triangle(5, 5, 5);

        //when
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            sut.setA(190);
        });
    }

}