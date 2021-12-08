package person.mitarbeiter;

import person.Mitarbeiter;
import person.MitarbeiterTyp;

public class BueroArbeiter extends Mitarbeiter {

    private double festgehalt;

    public BueroArbeiter(int id, String name, double festgehalt) {
        super(MitarbeiterTyp.BUEROARBEITER, id, name);
        this.festgehalt = festgehalt;
    }


    public double getFestgehalt() {
        return festgehalt;
    }

    public void setFestgehalt(double festgehalt) {
        this.festgehalt = festgehalt;
    }

    @Override
    public double einkommen() {
        return festgehalt;
    }
}
