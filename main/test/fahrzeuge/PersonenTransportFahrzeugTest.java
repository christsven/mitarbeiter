package fahrzeuge;

import fahrzeuge.varianten.Bus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import person.mitarbeiter.BueroArbeiter;
import person.mitarbeiter.Fahrer;

class PersonenTransportFahrzeugTest {

    @Test
    @DisplayName("Test_PTF_sitzplatzzuweisen")
    void test_sitzplatzzuweisung() {
        //given
        Bus sud = new Bus(
                new Fahrer(
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
        BueroArbeiter mitarbeiter = new BueroArbeiter(5500, "Test TEST", 100);

        //Einsteigen

        //when
        sud.einsteigen(mitarbeiter);
        //then
        Assertions.assertTrue(sud.getSitzplan().containsValue(mitarbeiter));

        //Aussteigen

        //when
        sud.aussteigen(mitarbeiter);
        //then
        Assertions.assertFalse(sud.getSitzplan().containsValue(mitarbeiter));
    }

}