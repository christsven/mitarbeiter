package person.mitarbeiter;

import person.MitarbeiterTyp;

public class Manager extends BueroArbeiter {

    private double bonussatz;

    public Manager(int id, String name, double festgehalt, double bonussatz) {
        super(id, name, festgehalt);
        setMitarbeiterTyp(MitarbeiterTyp.MANAGER);
        this.bonussatz = bonussatz;
    }

    public double getBonussatz() {
        return bonussatz;
    }

    public void setBonussatz(double bonussatz) {
        this.bonussatz = bonussatz;
    }

    @Override
    public double einkommen() {
        return getBonussatz() * getFestgehalt();
    }
}
