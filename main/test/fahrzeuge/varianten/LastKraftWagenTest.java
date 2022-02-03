package fahrzeuge.varianten;

import fahrzeuge.GPS;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import person.mitarbeiter.Fahrer;

class LastKraftWagenTest {

    @Test
    @DisplayName("Test_LWK_Beladen")
    void test_sitzplatzzuweisung() {
        //given
        LastKraftWagen sud = new LastKraftWagen(new Fahrer(
                3000,
                "Test test",
                30,
                10,
                "Lizenz"),
                new GPS(0, 0),
                100,
                50,
                10
        );

        Assertions.assertEquals(5, sud.beladen(5));
        Assertions.assertEquals(10, sud.beladen(5));
        //zu viel beladen = beladen schlägt fehl
        Assertions.assertEquals(10, sud.beladen(5));
        //zu viel abladen = leer
        Assertions.assertEquals(0, sud.entladen(300));
    }

}