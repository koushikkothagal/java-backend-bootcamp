package io.javabrains.javabasics;

/*
1.  Create a class called `Car` with member variables for the make, model, and year of the car.
        2.  Create a constructor method for the `Car` class that initializes the member variables.
        3.  Create getter methods for the make, model, and year.
        4.  Create a `toString` method that returns a string representation of the car in the form "year make model".
        5.  In the `main` method of this class, create a `Car` object with a make, model, and year of your choice.
        6.  Use the member variables and methods of the `Car` class to print the make, model, and year of the car.
        7.  The expected output of the program is:

        ```
        Make: Toyota
        Model: Camry
        Year: 2020
        Details: 2020 Toyota Camry
        ```

        */
class Car{
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make=make;
        this.model=model;
        this.year=year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "```" +
                "make:'" + make +
                ", model:'" + model +
                ", year:" + year +
                "```";
    }
}

public class ClassesAndObjects {

    public static void main(String[] args) {
        Car car=new Car("Toyota","Camry",2020);
        System.out.println(car);

    }
}
