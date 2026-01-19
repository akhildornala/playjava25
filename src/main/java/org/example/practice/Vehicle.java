package org.example.practice;

abstract class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public abstract void startEngine();

    public void stopEngine() {
        System.out.println(name + " engine stopped");
    }

    public String getName() {
        return name;
    }


}
