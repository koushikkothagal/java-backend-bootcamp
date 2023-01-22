# Classes

A class in Java is a blueprint for creating objects, which are instances of the class. A class defines the properties and methods that an object of that class will have. In other words, a class is a template for creating objects, and an object is an instance of a class.

## Declaring a Class

```java
public class MyClass {
    // properties and methods go here
}
```

This declares a class called `MyClass` with the `public` access modifier. This means that the class can be accessed from anywhere in the program.

## Properties

Properties are also known as fields or member variables, and they are used to store data for an object. In Java, properties are declared inside the class, but outside of any methods. For example:

```java
public class MyClass {
    int myProperty;
}
```

This declares a property called `myProperty` of type `int` for the `MyClass` class.

## Methods

Methods are used to define the behavior of an object. A method is a block of code that performs a specific task, and can be called on an object of a class. In Java, methods are also declared inside the class, and they have a return type and a name. For example:

```java
public class MyClass {
    void myMethod() {
        // code to be executed goes here
    }
}
```

This declares a method called `myMethod` with no return type for the `MyClass` class.

## Creating an Object

```java
MyClass myObject = new MyClass();
```

This creates a new object of the `MyClass` class and assigns it to the `myObject` variable.

## Accessing Properties and Methods

```java
myObject.myProperty = 5;
myObject.myMethod();
```

This assigns the value of 5 to the `myProperty` property of the `myObject` object, and calls the `myMethod` method on the `myObject` object.

## Constructors

A constructor is a special method that is called when an object of a class is created. A constructor doesn't have a return type, and its name is the same as the class name. A class can have multiple constructors, but they must have different parameter lists. For example:

```java
public class MyClass {
    int myProperty;

    public MyClass() {
        myProperty = 0;
    }

    public MyClass(int value) {
        myProperty = value;
    }
}
```

This declares a class called `MyClass` with two constructors. The first constructor sets the `myProperty` property to 0, and the second constructor accepts an int value and sets the `myProperty` property to that value.

## Encapsulation

Encapsulation is a technique used to hide the implementation details of a class, and expose only the necessary information to the outside world. This is achieved by using access modifiers, such as `private` and `public`, to control the access to properties and methods. For example:

```java
public class MyClass {
    private int myProperty;

    public int getMyProperty() {
        return myProperty;
    }

    public void setMyProperty(int value) {
        myProperty = value;
    }
}
```

This declares a class called `MyClass` with a private property called `myProperty`, and public methods `getMyProperty` and `setMyProperty` to access and modify the value of the property. This allows us to control the access to the property and ensure that it can only be accessed and modified through the provided methods. This is known as "getter" and "setter" methods.

## Inheritance

Inheritance is a mechanism that allows a class to inherit properties and methods from a parent class. This allows us to create a new class that inherits the properties and methods of an existing class, and can also add new properties and methods or override existing ones. For example:

```java
public class ParentClass {
    int myProperty;

    public void myMethod() {
        // code to be executed goes here
    }
}

public class ChildClass extends ParentClass {
    int myChildProperty;

    public void myChildMethod() {
        // code to be executed goes here
    }
}
```

This declares a class called `ParentClass` with a property called `myProperty` and a method called `myMethod`, and a class called `ChildClass` that inherits from `ParentClass` using the `extends` keyword. The `ChildClass` class also has its own property called `myChildProperty` and a method called `myChildMethod`.

## Polymorphism

Polymorphism is a mechanism that allows objects of different classes to be treated as objects of a common parent class. This allows us to write code that can work with objects of different classes, as long as they implement a common interface or inherit from a common parent class. For example:

```java
public class MyClass {
    public void myMethod() {
        // code to be executed goes here
    }
}

public class MyChildClass extends MyClass {
    public void myMethod() {
        // code to be executed goes here
    }
}
```

This declares a class called `MyClass` with a method called `myMethod` and a class called `MyChildClass` that inherits from `MyClass` and overrides the `myMethod` method.

```java
MyClass myObject1 = new MyClass();
MyClass myObject2 = new MyChildClass();

myObject1.myMethod();
myObject2.myMethod();
```

This creates two objects, one of the `MyClass` class and one of the `MyChildClass` class, and assigns them to the `myObject1` and `myObject2` variables, respectively. The `myMethod` method is called on both objects, and the appropriate overridden method will be called based on the actual type of the object.

In conclusion, classes are a fundamental concept in Java, and they provide a powerful mechanism for creating objects, encapsulating data and behavior, and creating reusable code. Understanding the concepts of properties, methods, constructors, access modifiers, inheritance, polymorphism and encapsulation is essential to become a proficient Java programmer.
