package com.company.ejercicio3;

public class Square extends Rectangle{
    //Constructor
    public Square(){
        super();
    }

    public Square(String colour, double side){
        super(colour, side, side);
    }

    //Metodo
    @Override
    public String toString(){
        return "Cuadrado: " + "Color: " + getColour() + " | Altura: " + getHeigh() + " | Ancho: " + getWeight();
    }
}
