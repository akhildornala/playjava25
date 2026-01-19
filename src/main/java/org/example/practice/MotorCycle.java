package org.example.practice;

public class MotorCycle extends Vehicle{

    public MotorCycle(String name){
        super(name);
    }

    @Override
    public void startEngine(){
        System.out.println(getName()+" starting with kick start.");
    }
}
