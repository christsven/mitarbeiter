package person.mitarbeiter;

import person.Mitarbeiter;
import person.MitarbeiterTyp;

public class SchichtArbeiter extends Mitarbeiter {

    private double stundenSatz;

    private int anzahlStunden;

    public SchichtArbeiter(int id, String name, double stundenSatz, int anzahlStunden) {
        super(MitarbeiterTyp.SCHICHTARBEITER, id, name);
        this.stundenSatz = stundenSatz;
        this.anzahlStunden = anzahlStunden;
    }

    @Override
    public double einkommen() {
        return stundenSatz * anzahlStunden;
    }

    public void setAnzahlStunden(int anzahlStunden) {
        this.anzahlStunden = anzahlStunden;
    }

    public int getAnzahlStunden() {
        return anzahlStunden;
    }
}
