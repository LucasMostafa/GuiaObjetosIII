package com.company.ejercicio2;

public class StaffMember extends Person{
    //Atributos
    private double salary;
    private String turn;

    //Constructor
    public StaffMember(){
        super();
    }

    public StaffMember(double DNI, String name, String surname, String email, String address, double salary, String turn){
        super(DNI, name, surname, email, address);
        this.salary= salary;
        this.turn= turn;
    }

    //Getter and Setter
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    //Metodos
    public double annualSalary(){
        return this.salary * 12;
    }
}
