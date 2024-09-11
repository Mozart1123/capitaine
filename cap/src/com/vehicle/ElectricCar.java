package com.vehicle;
public class ElectricCar extends Car {
    private double batteryLevel;

    public ElectricCar(){
        super();
        this.batteryLevel=100.0;
    }
    public void setBatteryLevel(double battery){
        if (battery >=0.0 && battery <=100.0){
            this.batteryLevel=battery;
        }
    }
    public double getBatteryLevel(){
        return this.batteryLevel;
    }
   @Override
    public void drive(int distance){
        super.drive(distance);
        this.batteryLevel-=(distance / 10000.0);
        if (this.batteryLevel < 0){
            this.batteryLevel=0;
        }
    }
}