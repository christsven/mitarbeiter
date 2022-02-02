package institution;

import fahrzeuge.KraftFahrZeug;
import person.mitarbeiter.Manager;
import person.mitarbeiter.Mitarbeiter;
import person.mitarbeiter.SchichtArbeiter;

import java.util.List;

public class Verwaltung extends Abteilung {

    //Verwaltung als child von Abteilung hat eine eigene liste!
    private List<Mitarbeiter> gesamtpersonal;
    private List<SchichtArbeiter> schichtArbeiterList;
    private List<Abteilung> abteilungList;
    private List<KraftFahrZeug> fuhrpark;

    public Verwaltung(String name, Manager leiter) {
        super(name, leiter);
    }

    //sobald eine Abteilung, ein Mitarbeiter oder Fahrzeug hinzugefügt wird, werden diese in die Listen aufgenommen

    //Sonderfall Abteilung: Die Mitarbeiterliste wird in die mitarbieterlist übertragen


    public List<Abteilung> getAbteilungList() {
        return abteilungList;
    }

    public List<KraftFahrZeug> getFuhrpark() {
        return fuhrpark;
    }

    public List<Mitarbeiter> getGesamtpersonal() {
        return gesamtpersonal;
    }

    public List<SchichtArbeiter> getSchichtArbeiterList() {
        return schichtArbeiterList;
    }

    public double berechneKostenArbeitstag() {
        double gesamtkosten = 0;

        for (Mitarbeiter mitarbeiter: getGesamtpersonal()) {
            gesamtkosten += mitarbeiter.einkommen();
        }
        return gesamtkosten;
    }

}
