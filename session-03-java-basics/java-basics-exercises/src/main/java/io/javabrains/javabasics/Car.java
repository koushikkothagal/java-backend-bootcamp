package io.javabrains.javabasics;

import static java.lang.String.join;

public class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    String getMake() {
        return make;
    }
    String getModel() {
        return model;
    }
    int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.join(" ", make, model, String.valueOf(year));
    }

}
