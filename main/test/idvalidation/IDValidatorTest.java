package idvalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import person.MitarbeiterTyp;

class IDValidatorTest {

    @Test
    void test_validation_for_wrong_id() {
        Assertions.assertEquals(
                IDStatus.INVALID_ID,
                IDValidator.validateID(MitarbeiterTyp.SCHICHTARBEITER, 5000));
    }

    @Test
    void test_validation_for_short_id() {
        Assertions.assertEquals(
                IDStatus.INVALID_ID,
                IDValidator.validateID(MitarbeiterTyp.SCHICHTARBEITER, 50));
    }

    @Test
    void test_validation_correct_id() {
        Assertions.assertEquals(
                IDStatus.OK,
                IDValidator.validateID(MitarbeiterTyp.SCHICHTARBEITER, 3500));
    }

    @Test
    void test_validation_taken_id() {
        //when
        Assertions.assertEquals(
                IDStatus.OK,
                IDValidator.saveID(MitarbeiterTyp.MANAGER, 1000));
        //then
        Assertions.assertEquals(
                IDStatus.ALREADY_TAKEN,
                IDValidator.saveID(MitarbeiterTyp.MANAGER, 1000));
    }

}