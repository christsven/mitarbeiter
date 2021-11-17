package institution;

import org.junit.Test;
import person.mitarbeiter.BueroArbeiter;
import person.mitarbeiter.Manager;
import person.mitarbeiter.SchichtArbeiter;

class AbteilungTest {

    @Test
    public void test_gehaltsliste() {
        //given
        Manager manager = new Manager(1000, "Chef", 10, 1.4);
        SchichtArbeiter schichtArbeiter = new SchichtArbeiter(3500, "Büro",);
        BueroArbeiter bueroArbeiter = new BueroArbeiter(5000, "Schicht",);
        Abteilung sut = new Abteilung();
    }


}