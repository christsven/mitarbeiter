package object.pricereader;

import object.TrianglePrism;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import shape.Triangle;

public class PriceServiceIT {

    private final String EXISTING_FILLING_MATERIAL = "Hartplastik";
    private final String EXISTING_SURFACE_MATERIAL = "Lack";
    private final String NONEXISTENT_MATERIAL = "Marmorbrocken";

    @Test
    @DisplayName("Functionality demonstration")
    public void functionality_pricecontroller_works() {

        PriceService service = new PriceService(
                "H:/Schule/SUD/Materiallisten/MaterialpreiseOberflaechen.csv",
                "H:/Schule/SUD/Materiallisten/MaterialpreiseFuellung.csv");

        //Test pricelists
        Assertions.assertDoesNotThrow(() -> service.importFillList("ABC:/Hello/Test"));
        printf("Filling pricelist:");
        printf(service.getFillList().toString());
        printf("Surface pricelist:");
        printf(service.getSurfaceList().toString());

        Assertions.assertFalse(service.doesMaterialExist(NONEXISTENT_MATERIAL));
        Assertions.assertTrue(service.doesMaterialExist(EXISTING_FILLING_MATERIAL));

        printf("Der Preis für %s beträgt %s€",
                EXISTING_FILLING_MATERIAL,
                String.valueOf(service.getPriceForFilling(EXISTING_FILLING_MATERIAL))
        );

        //Test Calculations
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> service.calculatePriceForObject(
                        new TrianglePrism(10, new Triangle(2, 2, 2), 10),
                        EXISTING_FILLING_MATERIAL,
                        NONEXISTENT_MATERIAL));
        Assertions.assertDoesNotThrow(() ->
                service.calculatePriceForObject(
                        new TrianglePrism(10, new Triangle(2, 2, 2), 10),
                        EXISTING_SURFACE_MATERIAL,
                        EXISTING_FILLING_MATERIAL));
        printf("Der Preis für ein Dreiecksprisma aus lackiertem Hartplastik beträgt %s€%n",
                String.valueOf(service.calculatePriceForObject(
                        new TrianglePrism(10, new Triangle(2, 2, 2), 10),
                        EXISTING_SURFACE_MATERIAL,
                        EXISTING_FILLING_MATERIAL)));
        printf("Test %s %s %s", "s","s","s");

    }

    private void printf(String format, Object ... inputs) {
        System.out.printf(
                String.format("%s\n", format),
                inputs
        );
    }

}
