package main;

import institution.Abteilung;
import person.mitarbeiter.BueroArbeiter;
import person.mitarbeiter.Manager;
import person.mitarbeiter.Mitarbeiter;
import person.mitarbeiter.SchichtArbeiter;

import java.util.ArrayList;

class MainClass {

    public static void main(String[] args){

        //Abteilung
        Manager manager = new Manager(5150,"ManagerName", 200, 1.5);
        Abteilung abteilung = new Abteilung("Abteilungsname", manager);

        ArrayList<Mitarbeiter> mitarbeiterArrayList = new ArrayList<>();

        //mehrere Mitarbeiter
        SchichtArbeiter schichtArbeiter = new SchichtArbeiter(3200, "SchichtName", 50, 10);
        BueroArbeiter bueroArbeiter = new BueroArbeiter(5800, "BueroName", 200);
        abteilung.addMitarbeiter(schichtArbeiter);
        abteilung.addMitarbeiter(bueroArbeiter);

        mitarbeiterArrayList.add(bueroArbeiter);
        mitarbeiterArrayList.add(schichtArbeiter);

        for (Mitarbeiter mitarbeiter: mitarbeiterArrayList) {
            mitarbeiter.einkommen();
        }

        System.out.println(abteilung.getGehalsliste());

    }
}
