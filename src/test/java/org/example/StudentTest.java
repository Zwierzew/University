package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void shouldReturnTrueIfDisplayedStudentInfoIsCorrect(){
        // given
        Student student = new Student("Administration", "III year", 5000);
        student.setName("Jan Kowalski");
        student.setAddress("30-347 Krakow, ul. M.Bobrzynskiego 23/3");

        // when
        String result = student.showDetails();
        String resultExpected = "Jan Kowalski:\n\t*address: 30-347 Krakow, ul. M.Bobrzynskiego 23/3\n\t*major: Administration" +
                "\n\t*college level: III year\n\t*tuition fee: 5000";

        // then
        assertTrue(result.equals(resultExpected));
    }
}