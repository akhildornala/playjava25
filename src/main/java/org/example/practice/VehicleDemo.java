package org.example.practice;

public class VehicleDemo {

    public static void main(String[] args) {
        Vehicle myCar = new Car("My Car");
        Vehicle myMotorCycle = new MotorCycle("My Motorcycle");

        myCar.startEngine();
        myMotorCycle.startEngine();

        myCar.stopEngine();
        myMotorCycle.stopEngine();
    }
}
