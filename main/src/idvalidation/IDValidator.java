package idvalidation;

import person.MitarbeiterTyp;

public class IDValidator {

    private static boolean checkIfFree(int id) {
        return true;
    }

    public static IDStatus validateID(MitarbeiterTyp typ, int id) {
        if (!checkIfFree(id)) {
            return IDStatus.ALREADY_TAKEN;
        }
        switch (typ) {
            case MANAGER:
                // Mitarbeiter IDs sind immer positiv und vierstellig.
                if(id > 999 && id < 3000 || id > 3999 && id < 5000 || id > 4999) {
                    return IDStatus.OK;
                } else {
                    return IDStatus.INVALID_ID;
                }
            case SCHICHTARBEITER:
                if(id > 2999 && id < 4000) {
                    return IDStatus.OK;
                } else {
                    return IDStatus.INVALID_ID;
                }
            case BUEROARBEITER:
                if(id > 4999 && id < 6000) {
                    return IDStatus.OK;
                } else {
                    return IDStatus.INVALID_ID;
                }
            default:
                return IDStatus.UNKNOWN_TYPE;
        }
    }

}
