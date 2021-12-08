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
        Manager manager = new Manager(1000, "Chef", 60, 1.4);
        SchichtArbeiter schichtArbeiter = new SchichtArbeiter(3500, "Büro",50, 10);
        BueroArbeiter bueroArbeiter = new BueroArbeiter(5000, "Schicht", 50);
        Abteilung sut = new Abteilung("Testabteilung", manager);
        sut.addMitarbeiter(bueroArbeiter);
        sut.addMitarbeiter(schichtArbeiter);
        sut.addMitarbeiter(manager);

        //when
        String result = sut.getGehalsliste();

        //then
        System.out.println(result);
    }

}