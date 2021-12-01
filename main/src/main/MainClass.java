package main;

import institution.Abteilung;
import person.mitarbeiter.Manager;

class MainClass {

    public static void main(String[] args){

        Manager manager = new Manager(200,"ManagerName", 200, 1.5);
        Abteilung abteilung = new Abteilung("Abteilungsname", manager);


        //funktioniert nicht aufgrund von package-protection
            //manager.setId();
    }
}
