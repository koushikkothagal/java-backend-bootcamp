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

public class ClassesAndObjects {
    static class Car {
        String make;
        String model;
        int year;

        Car(String make, String model, int year) {
            this.make=make;
            this.model=model;
            this.year=year;
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
        public String toString() {
            return year+" "+make+" "+model;
        }
    }
    public static void main(String[] args) {
        Car myCar = new Car("Honda", "Civic", 2024);

        // Using getters
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());

        // Using toString()
        System.out.println("Car details: " + myCar.toString());
    }
}
