package labTest.LabTest1.src;

import java.util.Arrays;

public class Car {
    // state values
    private String make;
    private String model;
    private String colour;
    private int year;
    private double[] speed;

    // Constructor 1
    public Car() {
        String make = "";
        String model = "";
        String colour = "";
        int year = 0;
        double[] speed = new double[5];
    }

    // Constructor 2
    public Car(String make, String model, String colour, int year, double[] speed) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
        this.speed = speed;
    }

    // Constructor 3
    public Car(int year, String colour) {
        this.year = year;
        this.colour = colour;
        String make = "";
        String model = "";

    }

    // Encapsulation
    // --------------------
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getYear() {
        return year;
    }

    public double[] getSpeed() {
        return speed;
    }

    // Override toString() method
    public String toString() {
        String s = "";
        s += "\nMake: " + make;
        s += "\nModel: " + model;
        s += "\nColour: " + colour;
        s += "\nYear: " + year;
        s += "\nTop Speed (kph, mph): " + Arrays.toString(speed);

        return s;
    }

}
