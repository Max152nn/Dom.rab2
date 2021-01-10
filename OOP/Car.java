package com.OOP;

//ex 9
public class Car {
    private String name;
    private int distance;
    private int fuelLevel;
    private int consumption;

    public Car(int consumption) {
        this.distance = 0;
        this.fuelLevel = 0;
        this.consumption = consumption;
    }

    public void moves(int miles){
        distance = distance + miles;
        consumption = (consumption / miles *100);
    }

    public void refuel(int gallons) {
        fuelLevel += gallons;
    }

    public int getDistance() {
        return distance;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    @Override
    public String toString() {
        return "Car{" +
                ", distance=" + distance +
                ", fuelLevel=" + fuelLevel +
                ", consumption=" + consumption +
                '}';
    }
}
