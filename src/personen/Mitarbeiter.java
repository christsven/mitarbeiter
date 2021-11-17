package personen;

import idvalidation.IDStatus;
import idvalidation.IDValidator;

public abstract class Mitarbeiter {

    private int id;

    private String name;

    public Mitarbeiter(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isBlank()) {
            this.name = name;
        }
    }

    public double einkommen() {
        return 0;
    }

    /**
     * sets ID for {@class Mitarbeiter} if valid.
     * @param id has to be positive, four digits
     */
    public void setId(MitarbeiterTyp typ, int id) {
        if(IDValidator.validateID(typ, id) == IDStatus.OK) {
            this.id = id;
        }
    }
}
