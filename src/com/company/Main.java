package com.company;

import com.company.ejercicio1.Circle;
import com.company.ejercicio1.Cylinder;
import com.company.ejercicio2.Person;
import com.company.ejercicio2.StaffMember;
import com.company.ejercicio2.Student;

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

        //Ejercicio 2
        Student student1= new Student(37867138, "Lucas", "Mostafa", "mostafalucas@gmail.com", "Costa Azul 4608", 2019, 1555, "Programacion");
        Student student2= new Student(38953932,"Gaston","Schiaffino","gastonschiaffino10@gmail.com","Tucuman 2370 2 E", 2020, 3800, "Programacion");
        Student student3= new Student(42963828,"Nicolas","Mostafa","mostafanicolas1@gmail.com","Bolivar y cordoba", 2015, 3500, "Analista de sistemas");
        Student student4= new Student(38953888, "Kevin", "Botta", "bottakevin@gmail.com", "Falucho 2640 4 H", 2021, 4800,"Ralaciones Publicas");

        StaffMember staffMember1= new StaffMember(27867125, "Juan", "Riquelme", "todosobreroman@gmail.com", "Brandsen 805", 200000, "tarde");
        StaffMember staffMember2= new StaffMember(21448228, "Karina", "Arana", "anakarinaarana@gmail.com", "Costa Azul 4608", 50000, "mañana");
        StaffMember staffMember3= new StaffMember(21416288,"Cecilia","Labarre", "cecilialabarre27@gmail.com","Brown 2507 8 G", 30000, "Mañana");
        StaffMember staffMember4= new StaffMember(17797205, "Sergio", "Schiaffino", "schaiffinosergia@gmail.com", "9 de Julio 7220", 45000, "Tarde");

        Person [] person= new Person[8];

        person[0]= student1;
        person[1]= student2;
        person[2]= student3;
        person[3]= student4;
        person[4]= staffMember1;
        person[5]= staffMember2;
        person[6]= staffMember3;
        person[7]= staffMember4;

        int student= 0;
        int staffMember= 0;

        for (Person members:person) {
            if(members!=null){
                if(members instanceof Student)
                    student++;
                if(members instanceof StaffMember)
                    staffMember++;
            }
        }

        System.out.println("\nLa cantidad de estudiantes es: " + student);
        System.out.println("La cantidad de miembros de staff es: " + staffMember);

        double totalFee= 0;

        for (Person institucion: person) {
            if(institucion!=null) {
                if (institucion instanceof Student)
                    totalFee += ((Student) institucion).getFee();
            }
        }

        System.out.println("\nLa cuota total percibida por la institucion es de: " + totalFee);
    }
}
