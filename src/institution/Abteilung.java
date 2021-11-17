package institution;

import person.Mitarbeiter;
import person.mitarbeiter.Manager;

import java.util.List;

public class Abteilung {

    private String name;

    private List<Mitarbeiter> mitarbeiterListe;

    private Manager leiter;

    public Abteilung(String name, Manager leiter) {
        this.name = name;
        this.leiter = leiter;
        mitarbeiterListe = List.of();
    }

    public void addMitarbeiter(Mitarbeiter toBeAdded) {
        mitarbeiterListe.add(toBeAdded);
    }

    public void removeMitarbeiter(Mitarbeiter mitarbeiter) {
        mitarbeiterListe.remove(mitarbeiter);
    }

    //TODO StringBuilder statt String
    public String getGehalsliste() {
        String gehaltsliste = String.format("Gehaltsliste Abteilung %s", getName());
        for (Mitarbeiter mitarbeiter: getMitarbeiterListe()) {
            gehaltsliste += (String.format(
                    "Name: %s\nID: %s\nGehalt: %s\n\n",
                    mitarbeiter.getName(),
                    mitarbeiter.getId(),
                    mitarbeiter.einkommen()
            ));
        }
        return gehaltsliste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Mitarbeiter> getMitarbeiterListe() {
        return mitarbeiterListe;
    }

    public void setMitarbeiterListe(List<Mitarbeiter> mitarbeiterListe) {
        this.mitarbeiterListe = mitarbeiterListe;
    }

    public Manager getLeiter() {
        return leiter;
    }

    //changeLeiter
    public void setLeiter(Manager leiter) {
        this.leiter = leiter;
    }
}
