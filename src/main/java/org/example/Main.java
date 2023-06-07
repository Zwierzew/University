package org.example;

public class Main {

    public static void main(String[] args){
        Student student = new Student("Finance", "I year", 3500);
        student.setName("Julia Kowalska");
        student.setAddress("23-781 Warszawa, ul. Lotnikow 2");

        Lecturer lecturer = new Lecturer("Auditor", 7500.00d);
        lecturer.setName("Wojciech Cichy");
        lecturer.setAddress("45-987 Gdynia, ul. Walna 32/56");

        displayPersonInfo(student);
        displayPersonInfo(lecturer);

    }
    private static void displayPersonInfo(Person person){
        if (person instanceof Student){
            System.out.println("Student " + person.showDetails());
        }
        if (person instanceof Lecturer){
            System.out.println("Lecturer " + person.showDetails());
        }
    }


}
