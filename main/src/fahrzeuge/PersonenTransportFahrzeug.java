package fahrzeuge;

import person.mitarbeiter.Fahrer;
import person.mitarbeiter.Mitarbeiter;

import java.util.ArrayList;

public abstract class PersonenTransportFahrzeug extends KraftFahrZeug {

    private final int sitze;

    //TODO doch ne Map? so ändern sich sitzplätze bei jedem ein/aussteigen
    private ArrayList<Mitarbeiter> sitzplan;


    public PersonenTransportFahrzeug(Fahrer fahrer, GPS position, double tankgroesse, double tankinhalt, int sitze) {
        super(fahrer, position, tankgroesse, tankinhalt);
        if(sitze > 1) {
            this.sitze = sitze;
            sitzplan = new ArrayList<>(sitze);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean einsteigen(Mitarbeiter mitarbeiter) {
        int sitzplatz = validateEinsteigen();
        if(sitzplatz != -1) {
            //TODO mitarbeiter platz zuweisen
            sitzplan.add(mitarbeiter);
            return true;
        }
        return false;
    }

    private int validateEinsteigen() {
        //if platz
            //return platz
        //else
        return -1;
    }

    //Getter und Setter
    public int getSitze() {
        return sitze;
    }
}
