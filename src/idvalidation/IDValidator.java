package idvalidation;

import personen.MitarbeiterTyp;

public class IDValidator {

    public static IDStatus validateID(MitarbeiterTyp typ, int id) {
        return switch (typ) {
            case MANAGER, BUEROARBEITER, SCHICHTARBEITER -> IDStatus.OK;
            default -> IDStatus.UNKNOWN_TYPE;
        };
    }

}
