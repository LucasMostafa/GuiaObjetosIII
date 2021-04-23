package com.company.ejercicio3;

public class Rectangle extends Figure{
    //Atributos
    public double height= 1.0;
    public double width= 1.0;

    //Constructor
    public Rectangle(){
        super();
    }
    public Rectangle(String colour, double heigh, double weight){
        super(colour);
        this.height= heigh;
        this.width= weight;
    }

    //Getter and setter
    public double getHeigh() {
        return height;
    }

    public void setHeigh(double heigh) {
        this.height = heigh;
    }

    public double getWeight() {
        return width;
    }

    public void setWeight(double weight) {
        this.width = weight;
    }

    //Metodos
    @Override
    public double calculateArea(){
        return this.width * this.height;
    }

    @Override
    public double calculatePerimeter(){
        return this.width * 2 + this.height * 2;
    }

    @Override
    public String toString(){
        return "Rectangulo: " + super.toString() + " | Altura: " + this.height +" | Ancho: " + this.width;
    }
}
