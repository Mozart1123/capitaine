package com.vehicle.test;
import com.vehicle.Car;
import com.vehicle.ElectricCar;
public class VehicleTest {
    public static void main(String[]args){
        Car myCar=new Car();
        myCar.setSpeed(120.0);
        myCar.setFuelLevel(80.0f);
        myCar.drive(5000);
        System.out.println("Car Speed in MPH :" + myCar.getSeedMph());
        System.out.println("car distance in KM :" + myCar.getDistanceKm());
        System.out.println("Remaining Fuel :"+ myCar.calculateRemainingFuel(5000));

        ElectricCar myElectricCar= new ElectricCar();
        myElectricCar.setSpeed(100.0);
        myElectricCar.setFuelLevel(90.0f);
        myElectricCar.setBatteryLevel(95.0);
        myElectricCar.drive(20000);
        System.out.println("Electirc car speed in MPH :"+ myElectricCar.getSeedMph());
        System.out.println("Electric car distance in km:"+ myElectricCar.getDistanceKm());
        System.out.println("Remaining Fuel :"+ myElectricCar.calculateRemainingFuel(20000));
        System.out.println("Remaining Battery :"+ myElectricCar.getBatteryLevel());

    }
}