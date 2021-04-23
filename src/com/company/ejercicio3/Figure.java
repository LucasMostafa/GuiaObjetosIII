package com.company.ejercicio3;

public abstract class Figure {
    //Atributos
    private String colour= "Amarillo";

    //Constructor
    public Figure(){
    }

    public Figure(String colour){
        this.colour= colour;
    }

    //Getter and Setter
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    //Metodos
    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    @Override
    public String toString(){
        return "Color: " + this.colour;
    }
}
