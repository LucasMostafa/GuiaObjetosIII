package com.company.ejercicio2;

public class Person {
    //Atributos
    private double DNI;
    private String name;
    private String surname;
    private String email;
    private String address;

    //Constructor
    public Person(){
    }

    public Person(double DNI, String name, String surname, String email, String address){
        this.DNI= DNI;
        this.name= name;
        this.surname= surname;
        this.email= email;
        this.address= address;
    }

    //Getter and setter
    public double getDNI() {
        return DNI;
    }

    public void setDNI(double DNI) {
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
