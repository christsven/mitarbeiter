package person.mitarbeiter;

import person.Mitarbeiter;
import person.MitarbeiterTyp;

public class BueroArbeiter extends Mitarbeiter {

    private double festgehalt;

    public BueroArbeiter(int id, String name, double festgehalt) {
        super(MitarbeiterTyp.BUEROARBEITER, id, name);
        setFestgehalt(festgehalt);
    }


    public double getFestgehalt() {
        return festgehalt;
    }

    public void setFestgehalt(double festgehalt) {
        if(festgehalt >= 0) {
            this.festgehalt = festgehalt;
        } else {
            throw new IllegalArgumentException("Festgehalt has to be positive.");
        }
    }

    @Override
    public double einkommen() {
        return festgehalt;
    }
}
