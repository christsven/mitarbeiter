package personen.mitarbeiter;

import personen.Mitarbeiter;

public class BueroArbeiter extends Mitarbeiter {

    private double festgehalt;

    public BueroArbeiter(int id, String name, double festgehalt) {
        super(id, name);
        this.festgehalt = festgehalt;
    }

    public double getFestgehalt() {
        return festgehalt;
    }

    public void setFestgehalt(double festgehalt) {
        this.festgehalt = festgehalt;
    }
}
