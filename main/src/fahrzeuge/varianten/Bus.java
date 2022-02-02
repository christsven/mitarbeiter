package fahrzeuge.varianten;

import fahrzeuge.GPS;
import fahrzeuge.PersonenTransportFahrzeug;
import person.mitarbeiter.Fahrer;

public class Bus extends PersonenTransportFahrzeug {

    public Bus(Fahrer fahrer, GPS position, double tankgroesse, double tankinhalt, int sitze) {
        super(fahrer, position, tankgroesse, tankinhalt, sitze);
    }

    @Override
    public double auslastung() {
        return 0;
    }

}
