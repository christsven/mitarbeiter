package person.mitarbeiter;

public class Manager extends BueroArbeiter {

    private double bonussatz;

    public Manager(int id, String name, double festgehalt, double bonussatz) {
        super(id, name, festgehalt);
        this.bonussatz = bonussatz;
    }

    public double getBonussatz() {
        return bonussatz;
    }

    public void setBonussatz(double bonussatz) {
        this.bonussatz = bonussatz;
    }

    public double calculateBonus() {
        return getBonussatz() * getFestgehalt();
    }

    @Override
    public double einkommen() {
        return calculateBonus();
    }
}
