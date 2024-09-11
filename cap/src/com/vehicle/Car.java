package com.vehicle;
public class Car {
    private double speedKph;
    private float fuelLevel;
    private int distanceTraveled;

    public Car(){
        this.speedKph = 0.0;
        this.fuelLevel= 100.0f; // full tank by default
        this.distanceTraveled= 0;

    }
    public void setSpeed( double speed) {
        this.speedKph = speed;
    }
    public void setFuelLevel(float fuel){
        if (fuel >=0.0 && fuel <=100.0){
            this.fuelLevel= fuel;
        }
    }
    public void drive(int distance){
        this.distanceTraveled+= distance;
        this.fuelLevel-= (float) ((distance / 1000.0)* 0.5f);
        if (this.fuelLevel < 0){
            this.fuelLevel = 0;
        }
    }

    public double getSeedMph() {
        return this.speedKph / 1.60934;//conversion from Kph to Mph
    }
    public int getDistanceKm(){
        return this.distanceTraveled/1000;
    }
    public float calculateRemainingFuel(double distance){
        float remainingFuel = this.fuelLevel- (float) ((distance/ 1000.0)*0.5);
        return remainingFuel >=0 ? remainingFuel:0;
    }
}

