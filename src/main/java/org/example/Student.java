package org.example;
/*
Zaimplementuj klasę Student. Klasa ta powinna rozszerzać klasę Person. Dodatkowo powinna zawierać:
* trzy pola: typ studiów, rok studiów, koszt studiów
* konstruktor z trzema parametrami: typ studiów, rok studiów, koszt studiów
* metody typu getter dla zdeklarowanych pól
* metody typu setter dla zdeklarowanych pól
* metoda showDetails wyświetlająca szczegółowe informacje o studencie
 */
public class Student extends Person{
    private String major;
    private String collegeLevel;
    private int tuitionFee;

    public Student(String major, String collegeLevel, int tuitionFee){
        super(); //aby móc odwołać się do konstruktora z parametrami z klasy Person, należy przekazać dodatkowe
        this.major = major;           //dwa parametry String name, String address konstruktorowi Student?
        this.collegeLevel = collegeLevel;    //w przeciwnym wypadku zmuszeni jesteśmy do zastosowania konstruktora
        this.tuitionFee = tuitionFee;        // bezparametrowego?
    }
    public Student(String name, String address, String major, String collegeLevel, int tuitionFee){
        super(name, address);
        this.major = major;
        this.collegeLevel = collegeLevel;
        this.tuitionFee = tuitionFee;
    }

    @Override
    String showDetails(){
        return String.format("%s:\n\t*address: %s\n\t*major: %s\n\t*college level: %s\n\t*tuition fee: %d",
                getName(), getAddress(), major, collegeLevel, tuitionFee);
    }
    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public String getCollegeLevel(){
        return collegeLevel;
    }
    public void setCollegeLevel(String collegeLevel){
        this.collegeLevel = collegeLevel;
    }
    public int getTuitionFee(){
        return tuitionFee;
    }
    public void setTuitionFee(int tuitionFee){
        this.tuitionFee = tuitionFee;
    }
}
