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
    String make,model;
    int year;
    Car(){};
    void setMake(String m){ this.make=m; }
    String getMake(){ return make; }
    void setModel(String mo){
        this.model=mo;
    }
    String getModel(){
        return model;
    }
    void setYear(int y){
        this.year=y;
    }
    int getYear(){
        return year;
    }
    String toStr(){
        return year+" "+make+" "+model;
    }
}
public class ClassesAndObjects {
    public static void main(String[] args) {
        String make,model;int year;
        Car obj=new Car();
        obj.setMake("Toyota");
        obj.setModel("Camry");
        obj.setYear(2020);
        System.out.println("Make: "+obj.getMake()+'\n'+"Model: "+obj.getModel()+'\n'+"Year: "+obj.getYear());
        System.out.println(obj.toStr());
    }
}
