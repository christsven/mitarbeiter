package institution;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import person.mitarbeiter.BueroArbeiter;
import person.mitarbeiter.Manager;
import person.mitarbeiter.SchichtArbeiter;

class AbteilungTest {

    @Test
    @DisplayName("Test_Gehaltsliste")
    void test_gehaltsliste() {
        //given
        Manager manager = new Manager(5100, "Chef", 60, 1.4);
        SchichtArbeiter schichtArbeiter = new SchichtArbeiter(3100, "Büro",50, 10);
        BueroArbeiter bueroArbeiter = new BueroArbeiter(5200, "Schicht", 50);
        Abteilung sut = new Abteilung("Testabteilung", manager);
        sut.addMitarbeiter(bueroArbeiter);
        sut.addMitarbeiter(schichtArbeiter);

        //when
        String result = sut.getGehalsliste();

        //then
        System.out.println(result);
    }

}