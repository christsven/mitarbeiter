package object.pricereader;

import object.TrianglePrism;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import shape.Triangle;

class PriceControllerTest {

    private final String PATH_FILLING = "H:/Schule/SUD/Materiallisten/MaterialpreiseOberflaechen.csv";
    private final String PATH_SURFACE = "H:/Schule/SUD/Materiallisten/MaterialpreiseFuellung.csv";

    @Test
    @DisplayName("Constructor works correctly")
    public void test_constructor_import() {
        PriceController sut = new PriceController(PATH_SURFACE, PATH_FILLING);
        System.out.println(sut.getFillList());
        System.out.println(sut.getSurfaceList());
    }

    @Test
    @DisplayName("Calculation works correctly")
    public void test_calculation() {
        Triangle testTriangle = new Triangle(10, 10, 10);
        TrianglePrism testPrism = new TrianglePrism(10, testTriangle, 10);
        PriceController sut = new PriceController(PATH_SURFACE, PATH_FILLING);

        Assertions.assertTrue(sut.doesMaterialExist("Lack"));
        Assertions.assertTrue(sut.doesMaterialExist("Stahl"));

        System.out.println(sut.calculatePriceForObject(testPrism, "Lack", "Stahl"));
    }

}