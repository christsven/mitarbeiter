package personen.mitarbeiter;

import personen.Mitarbeiter;

public class SchichtArbeiter extends Mitarbeiter {

    private double stundenSatz;

    private int anzahlStunden;

    public SchichtArbeiter(int id, String name, double stundenSatz) {
        super(id, name);
        this.stundenSatz = stundenSatz;
    }
}
