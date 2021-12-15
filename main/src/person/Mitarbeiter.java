package person;

import idvalidation.IDStatus;
import idvalidation.IDValidator;

public abstract class Mitarbeiter {

    private int id;

    private String name;

    private MitarbeiterTyp typ;

    public Mitarbeiter(MitarbeiterTyp typ, int id, String name) {
        setName(name);
        setMitarbeiterTyp(typ);
        setId(typ, id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MitarbeiterTyp getTyp() {
        return typ;
    }

    public void setName(String name) {
        if(!name.isBlank()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("String name cannot be blank.");
        }
    }

    public abstract String toString();

    public abstract double einkommen();

    /**
     * sets ID for {@class Mitarbeiter} if valid.
     * @param id has to be positive, four digits
     */
    protected void setId(MitarbeiterTyp typ, int id) {
        IDStatus status = IDValidator.validateID(typ, id);
        if(status == IDStatus.OK) {
            this.id = id;
        } else {
            throw new IllegalArgumentException(String.format("Falsche ID für Mitarbeiter %s: %s", name, status));
        }
    }

    /**
     * sets Typ, necessary for {@class Manager} and other child classes
     * @param typ MitarbeiterTyp of Mitarbeiter
     */
    protected void setMitarbeiterTyp(MitarbeiterTyp typ) {
        this.typ = typ;
    }
}
