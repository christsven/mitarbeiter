package idvalidation;

import person.MitarbeiterTyp;

import java.util.ArrayList;
import java.util.List;

public class IDValidator {

    private static boolean checkIfFree(int id) {
        return !listIDs.contains(id);
    }

    private static final List<Integer> listIDs = new ArrayList<>();

    /**
     * validates and saves ID to list.
     */
    public static IDStatus saveID(MitarbeiterTyp typ, int id) {
        IDStatus returnValue = validateID(typ, id);
        if(returnValue.equals(IDStatus.OK)) {
            listIDs.add(id);
        }
        return returnValue;
    }

    /**
     * validates if id is correct and not taken.
     */
    public static IDStatus validateID(MitarbeiterTyp typ, int id) {
        if (!checkIfFree(id)) {
            return IDStatus.ALREADY_TAKEN;
        }
        switch (typ) {
            case MANAGER:
                // Mitarbeiter IDs sind immer positiv und vierstellig.
                if(id > 999 && id < 3000 || id > 3999 && id < 5000 || id > 4999) {
                    break;
                } else {
                    return IDStatus.INVALID_ID;
                }
            case SCHICHTARBEITER:
                if(id > 2999 && id < 4000) {
                    break;
                } else {
                    return IDStatus.INVALID_ID;
                }
            case BUEROARBEITER:
                if(id > 4999 && id < 6000) {
                    break;
                } else {
                    return IDStatus.INVALID_ID;
                }
            default:
                return IDStatus.UNKNOWN_TYPE;
        }
        return IDStatus.OK;
    }

}
