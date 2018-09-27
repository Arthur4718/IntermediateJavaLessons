package com.interjava.javapratice;

public class Car {

    public String colour = "Black";
    private int numberOfSeats = 5; // It is wise to use private variables
    private String mInterior; // Since its private we need a get or set method

    public Car(){
        //Constructor Method
        //Additional constructions to construct the object
        mInterior = "Leather";
    }

    public Car(String chosenColour, String chosenInterior){
        //Init the object with a set of properties

        this.colour = chosenColour;
        this.mInterior = chosenInterior;
    }

    public int getNumberOfSeats() {
        //add code here
        //if other classes want to read the value of sets, the get method would give it to them
        return numberOfSeats;
    }

    public String getInterior() {
        return mInterior;
    }

    public void drive(){
        System.out.println("Car is moving");
    }

    public String drive(double milesPerHour){
        return "Car is Moving";

    }
}
