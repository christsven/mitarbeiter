package fahrzeuge;

import person.mitarbeiter.Fahrer;
import person.mitarbeiter.Mitarbeiter;

import java.util.HashMap;
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
        int sitzplatz = returnEmptySeat();
        if(sitzplatz != -1 && !getSitzplan().containsValue(mitarbeiter)) {
            getSitzplan().put(sitzplatz, mitarbeiter);
            System.out.printf(
                    "Mitarbeiter %s eingestiegen auf Platz %s%n",
                    mitarbeiter.toString(),
                    sitzplatz);
            return true;
        }
        return false;
    }

    //TODO testing
    private int returnEmptySeat() {
        int sitzplatz = -1;
        for (int i = 0; i < getSitze(); i++) {
            if (getSitzplan().get(i) == null) {
                sitzplatz = i;
            } else {
                i++;
            }
        }
        return sitzplatz;
    }

    //Getter und Setter
    public int getSitze() {
        return sitze;
    }

    public Map<Integer, Mitarbeiter> getSitzplan() {
        return sitzplan;
    }

    /**
     * Wir brauchen eine Map mit
     *   einer festen Größe,
     *   festen Sitzplätzen,
     *   einer Möglichkeit, dass die Plätze leer sind.
     * Deshalb kann man weder Listen (nicht eindeutig)
     * noch Arrays (keine leeren Werte) verwenden.
     *
     * Hier wird eine leere Map mit null-Werten auf
     * freien Sitzplätzen erzeugt.
     */
    private void createEmptyHashMapSitzplan() {
        HashMap<Integer, Mitarbeiter> sitzplan = new HashMap<>();
        for (int i = 0; i < sitze; i++) {
            sitzplan.put(i, null);
        }
        this.sitzplan = sitzplan;
    }
}
