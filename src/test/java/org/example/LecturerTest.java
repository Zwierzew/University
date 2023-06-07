package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LecturerTest {
    @Test
    void shouldReturnTrueIfDisplayedLecturerInfoIsCorrect(){
        // given
        Lecturer lecturer = new Lecturer("Architecture", 7500.00d);
        lecturer.setName("Olga Obara");
        lecturer.setAddress("26-006 Bieliny, ul. Kielecka 18");

        // when
        String result = lecturer.showDetails();
        String resultExpected = "Olga Obara:\n\t*address: 26-006 Bieliny, ul. Kielecka 18 " +
                "\n\t*specialization: Architecture \n\t*remuneration: 7500.000000";
                // jak obciąć zera z double?
        // then
        assertTrue(result.equals(resultExpected));
    }
}