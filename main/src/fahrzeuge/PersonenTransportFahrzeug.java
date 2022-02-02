package fahrzeuge;

import person.mitarbeiter.Fahrer;
import person.mitarbeiter.Mitarbeiter;

import java.util.Map;

public abstract class PersonenTransportFahrzeug extends KraftFahrZeug {

    private final int sitze;

    /**
     *  K/V-Map, da ansonsten bei bpsw einer ArrayList
     *      1.) die Sitzplätze sind nicht eindeutig
     *      2.) die Anzahl der Sitzplätze ist nicht eindeutig
     *  wären.
     */
    private Map<Integer, Mitarbeiter> sitzplan;


    public PersonenTransportFahrzeug(Fahrer fahrer, GPS position, double tankgroesse, double tankinhalt, int sitze) {
        super(fahrer, position, tankgroesse, tankinhalt);
        if(sitze > 1) {
            this.sitze = sitze;
            createEmptyHashMapSitzplan();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean einsteigen(Mitarbeiter mitarbeiter) {
        int sitzplatz = validateEinsteigen();
        if(sitzplatz != -1) {
            //TODO mitarbeiter platz zuweisen
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

    /**
     * Wir brauchen eine Map mit
     *   einer festen Größe,
     *   festen Sitzplätzen,
     *   einer Möglichkeit, dass die Plätze leer sind.
     * Deshalb kann man weder Listen (nicht eindeutig)
     * noch Arrays (keine leeren Werte) verwenden.
     *
     * Hier wird
     */
    private void createEmptyHashMapSitzplan() {

    }
}
