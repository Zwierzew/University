package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    void shouldReturnTrueIfPersonIsTypeStudent(){
        // given
        Student student = new Student("Architecture", "III year", 5000);
        student.setName("Julia Adamczyk");
        student.setAddress("23-781 Warszawa, ul. Lotnikow 2");

        // when
        String result = student.showDetails();
        String resultExpected = "Julia Adamczyk:\n\t*address: 23-781 Warszawa, ul. Lotnikow 2\n\t*major: Architecture" +
                "\n\t*college level: III year\n\t*tuition fee: 5000";

        // then
        assertTrue(student instanceof Student);
        assertTrue(result.equals(resultExpected));
    }
    @Test
    void shouldReturnTrueIfPersonIsTypeLecturer(){
        // given
        Lecturer lecturer = new Lecturer("Law", 15000.00d);

        // when
        lecturer.showDetails();

        // then
        assertTrue(lecturer instanceof Lecturer);
    }
}


