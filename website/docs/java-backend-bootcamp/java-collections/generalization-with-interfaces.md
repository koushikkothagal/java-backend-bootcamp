# Generalization with Interfaces

In Object Oriented Programming, interfaces are a way to define a contract for a group of related classes. An interface defines a set of method signatures, but does not provide an implementation for those methods. Classes that implement the interface must provide an implementation for all of the methods defined in the interface.

Consider the interface below:

```java
interface Shape {
    double getArea();
    double getPerimeter();
}
```

Classes that implement the interface must provide an implementation for all of the methods defined in the interface. For example, we could have a `Rectangle` class that implements the `Shape` interface:

```java
class Rectangle implements Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
```

We can also have a `Circle` class that also implements the `Shape` interface:

```java
class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
```

Now we can create a method that needs to work on shapes to take `Shape` as an argument.

```java
public doSomethingWithShapes(Shape s) {
	// Do something here
}
```

This is powerful because it allows for flexibility in implementation. This is especially important where we're creating APIs for others to consume. Using an interface as an API contract helps us have a stable unchanging API while the underlying implementations change over time.

For example, if later on we decide to use a more efficient algorithm for calculating the area of a circle, we can change the implementation of the `Circle` class, without affecting the code that uses the `Circle` class. As long as the new implementation still adheres to the contract defined by the `Shape` interface, the code that uses the `Circle` class will continue to work correctly.

Therefore, the main benefit of using interfaces is that it allows for a clear separation between the interface and the implementation. The implementation can be changed without affecting the code that uses the implementation, as long as the new implementation still adheres to the contract defined by the interface.

:::note
The core idea here is not to demonstrate polymorphism itself. But to show how an API can define the contract and how the implementing classes that do the work can be "pluggable" without any changes to the consumers of the API. This is the approach used by the Collection framework, so it's very important to learn about this.
:::
