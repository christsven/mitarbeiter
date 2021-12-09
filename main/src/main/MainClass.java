package main;

import institution.Abteilung;
import person.mitarbeiter.BueroArbeiter;
import person.mitarbeiter.Manager;
import person.mitarbeiter.SchichtArbeiter;

class MainClass {

    public static void main(String[] args){

        //Abteilung
        Manager manager = new Manager(5150,"ManagerName", 200, 1.5);
        Abteilung abteilung = new Abteilung("Abteilungsname", manager);

        //mehrere Mitarbeiter
        SchichtArbeiter schichtArbeiter = new SchichtArbeiter(3200, "SchichtName", 50, 10);
        BueroArbeiter bueroArbeiter = new BueroArbeiter(5800, "BueroName", 200);
        abteilung.addMitarbeiter(schichtArbeiter);
        abteilung.addMitarbeiter(bueroArbeiter);

        System.out.println(abteilung.getGehalsliste());

    }
}
