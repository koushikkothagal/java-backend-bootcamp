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

    public static void main(String[] args) {
        class Car {
            private String make, model;
            private int year;

            public Car(String make, String model, int year){
                this.make = make;
                this.model = model;
                this.year = year;
            }

            public String getMake(){
                return make;
            }

            public String getModel(){
                return model;
            }

            public int getYear(){
                return year;
            }

            @Override
            public String toString() {
                return String.format("%d %s %s", year, make, model);
            }
        }

        Car myCar = new Car("Toyota", "Camry", 2017);

        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Details: " + myCar.toString());
    }
}
