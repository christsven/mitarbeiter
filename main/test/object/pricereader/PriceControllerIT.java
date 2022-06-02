package object.pricereader;

import object.TrianglePrism;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import shape.Triangle;

public class PriceControllerIT {

    private final String PATH_FILLING = "H:/Schule/SUD/Materiallisten/MaterialpreiseOberflaechen.csv";
    private final String PATH_SURFACE = "H:/Schule/SUD/Materiallisten/MaterialpreiseFuellung.csv";

    @Test
    @DisplayName("Functionality demonstration")
    public void functionality_pricecontroller_works() {

        PriceController controller = new PriceController(PATH_SURFACE, PATH_FILLING);

        Assertions.assertFalse(controller.doesMaterialExist("Marmor"));
        Assertions.assertTrue(controller.doesMaterialExist("Stahl"));

        Assertions.assertDoesNotThrow(() -> controller.importFillList("ABC:/Hello/Test"));

        System.out.println("Filling pricelist:");
        System.out.println(controller.getFillList().toString());
        System.out.println("Surface pricelist:");
        System.out.println(controller.getSurfaceList().toString());

        controller.getPriceForFilling("Stahl");

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                controller.calculatePriceForObject(
                        new TrianglePrism(10, new Triangle(2, 2, 2), 10),
                        "Stahl",
                        "Test")
        );

        Assertions.assertDoesNotThrow(() ->
                controller.calculatePriceForObject(
                        new TrianglePrism(10, new Triangle(2, 2, 2), 10),
                        "Hartplastik",
                        "Lack")
        );

    }
}
