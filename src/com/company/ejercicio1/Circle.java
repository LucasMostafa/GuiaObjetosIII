package com.company.ejercicio1;

public class Circle {
    //Atributos
    private double radio= 1.0;
    private String colour= "rojo";
    public static final double PI= 3.141592653589793;

    //Constructor
    public Circle(){
    }

    public Circle(double radio, String colour){
        this.radio= radio;
        this.colour= colour;
    }

    //Getter and setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    //Metodos
    public double calculateArea(){
        return PI*(this.radio * this.radio);
    }

    public String toString(){
        return "\nEl circulo posee un radio de " + this.radio + ", es de color " + this.colour + " y tiene un area de " + calculateArea();
    }
}
