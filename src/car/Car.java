package car;

import java.io.*;

public class Car implements Serializable {
    String brand;
    String model;
    int year;
    String color;
    int power;

    public Car(String brand, String model, int year, String color, int power) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", model=" + model +
                ", year=" + year +
                ", color=" + color +
                ", power=" + power +
                '}';
    }

}

