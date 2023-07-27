package org.example;
/*
Zaimplementuj klasę Lecturer. Klasa ta powinna rozszerzać klasę Person. Dodatkowo powinna zawierać:
* dwa pola: specjalizacja oraz wynagrodzenie
* konstruktor z dwoma parametrami: specjalizacja, wynagrodzenie
* metody typu getter dla zdeklarowanych pól
* metody typu setter dla zdeklarowanych pól
* metodę showDetails wyświetlającą szczegółowe informację o wykładowcy
Zaprezentuj zaimplementowane powyżej rozwiązanie na przykładzie.
 */
public class Lecturer extends Person {
    private String specialization;
    private double remuneration;

    public Lecturer(String specialization, double remuneration){
        super();
        this.specialization =specialization;
        this.remuneration =remuneration;
    }
    public Lecturer(String name, String address, String specialization, double remuneration){
        super (name, address);
        this.specialization = specialization;
        this.remuneration = remuneration;
    }

    @Override
    String showDetails(){
        return String.format("%s:\n\t*address: %s \n\t*specialization: %s \n\t*remuneration: %f",
                getName(), getAddress(), specialization, remuneration);
    }
    public String getSpecialization(){
        return specialization;
    }
    public void setSpecialization(){
        this.specialization = specialization;
    }
    public double getRemuneration(){
        return remuneration;
    }
    public void setRemuneration(){
        this.remuneration = remuneration;
    }
}
