package main;

import institution.Abteilung;
import person.mitarbeiter.BueroArbeiter;
import person.mitarbeiter.Manager;
import person.mitarbeiter.SchichtArbeiter;

class MainClass {

    public static void main(String[] args){

        //Abteilung
        Manager manager = new Manager(200,"ManagerName", 200, 1.5);
        Abteilung abteilung = new Abteilung("Abteilungsname", manager);

        //mehrere Mitarbeiter
        SchichtArbeiter schichtArbeiter = new SchichtArbeiter(1000, "SchichtName", 10, 10);
        BueroArbeiter bueroArbeiter = new BueroArbeiter(1000, "BueroName", 200);
        abteilung.addMitarbeiter(schichtArbeiter);
        abteilung.addMitarbeiter(bueroArbeiter);

        abteilung.getGehalsliste();

        //Aufgabe f) funktioniert nicht aufgrund von package-protection
            //manager.setId();
    }
}
