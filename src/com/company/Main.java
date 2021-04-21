package com.company;

import com.company.ejercicio1.Circle;
import com.company.ejercicio1.Cylinder;

public class Main {

    public static void main(String[] args) {

        Circle circle= new Circle(3, "azul");
        System.out.println(circle.toString());

        //Ejercicio 1
        Cylinder cylinder= new Cylinder();
        System.out.println("\nCilindro n° 1:");
        System.out.println("Radio: " + cylinder.getRadio());
        System.out.println("Altura: " + cylinder.getHeigth());
        System.out.println("Area: " + cylinder.calculateArea());
        System.out.println("Volumen: " + cylinder.calculateVolumeCylinder());

        Cylinder cylinder2= new Cylinder(circle.getRadio(), "amarillo", 9);
        System.out.println("\nCilindro n° 2:");
        System.out.println("Radio: " + cylinder2.getRadio());
        System.out.println("Altura: " + cylinder2.getHeigth());
        System.out.println("Area: " + cylinder2.calculateArea());
        System.out.println("Volumen: " + cylinder2.calculateVolumeCylinder());

        System.out.println("\nArea: " + cylinder2.calculateArea());
        System.out.println("Volumen: " + cylinder2.calculateVolumeCylinder());

        System.out.println(cylinder2.toString());
    }
}
