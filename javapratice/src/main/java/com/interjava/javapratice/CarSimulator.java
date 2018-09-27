package com.interjava.javapratice;

public class CarSimulator {

    public static void main(String[] args) {

        System.out.println("Launching car simulator");

        Car myFusquinha = new Car();

        System.out.println("The car colour is " + myFusquinha.colour);

        myFusquinha.colour = "Blue";

        System.out.println("The car colour is " + myFusquinha.colour);

        System.out.println("my car has " + myFusquinha.getNumberOfSeats() + " seats");

        Car myHonda = new Car();

        System.out.println("My Honda has " + myHonda.colour + " colour and its interior is " + myHonda.getInterior());

        myHonda.drive();
    }
}
