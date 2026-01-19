package org.example.practice;

public class Car extends Vehicle {

    public Car(String name) {
        super(name);
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + " starting with key ignition");
    }
}
