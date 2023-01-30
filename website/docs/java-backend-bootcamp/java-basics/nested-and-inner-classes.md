# Nested and Inner Classes in Java

In Java, a class can be defined inside another class, which is known as a nested class. There are two types of nested classes in Java: static nested classes and inner classes.

## Static Nested Classes

A static nested class is a class that is defined inside another class and is marked as static. The static nested class does not have access to the non-static members of the outer class. A static nested class is also known as a static inner class. The syntax for a static nested class is as follows:

```java
class OuterClass {
    static class NestedClass {
        // properties and methods
    }
}
```

To access a static nested class, you need to use the outer class name followed by the nested class name, separated by a dot. For example, to create an instance of the "NestedClass" in the above example, you would use the following code:

```java
OuterClass.NestedClass nestedObject = new OuterClass.NestedClass();
```

## Inner Classes

An inner class is a class that is defined inside another class and does not have the static keyword. An inner class has access to the non-static members of the outer class, including private members. The syntax for an inner class is as follows:

```java
class OuterClass {
    class InnerClass {
        // properties and methods
    }
}
```

To access an inner class, you first need to create an instance of the outer class, and then you can create an instance of the inner class using the outer class instance. For example, to create an instance of the "InnerClass" in the above example, you would use the following code:

```java
OuterClass outerObject = new OuterClass();
OuterClass.InnerClass innerObject = outerObject.new InnerClass();
```

Inner classes are further classified as Member Inner class, Local Inner class, Anonymous Inner class, and Lambda Expression.

Member Inner class: a class defined inside another class but outside a method.  
Local Inner class: a class defined inside a method.  
Anonymous Inner class: a class without a name defined inside a method.  
Lambda Expression: a functional interface defined inside a method.  
Let's see each of them in detail with an example:

## Member Inner class

```java
class Outer {
    private int x = 10;
    class Inner {
        void display() {
            System.out.println("Outer x: " + x);
        }
    }
}
```

Here, `Inner` is the member inner class. To create the instance of `Inner` class, first we need to create the instance of the outer class and then call the inner class

```java
Outer outer = new Outer();
Outer.Inner inner = outer.new Inner();
inner.display(); // prints "Outer x: 10"
```

## Local Inner class

```java
class Outer {
    int x = 10;
    void doSomething() {
        class Inner {
            void display() {
                System.out.println("Outer x: " + x);
            }
        }
        Inner inner = new Inner();
        inner.display();
    }
}
```

Here, `Inner` is the local inner class. We can only create the instance of `Inner` class inside the doSomething method

## Anonymous Inner class

```java
class Outer {
    int x = 10;
    void doSomething() {
        new Inner() {
            void display() {
                System.out.println("Outer x: " + x);
            }
        }.display();
    }
}
```

Here, `Inner` is an anonymous inner class, as it doesn't have a name. Anonymous inner class is defined and instantiated in a single step. Anonymous inner class is used when we need to use a class only once.

## Lambda Expression

```java
interface MyFunction {
    void call();
}
class Outer {
    int x = 10;
    void doSomething() {
        MyFunction f = () -> System.out.println("Outer x: " + x);
        f.call();
    }
}
```

Here, the lambda expression is used to define the functional interface MyFunction.

In conclusion, nested and inner classes in Java provide a way to group related classes together and improve the organization of your code. Static nested classes are used when the nested class does not need access to the non-static members of the outer class, while inner classes are used when the nested class does need access to the non-static members of the outer class. Inner classes are further classified into member inner class, local inner class, anonymous inner class, and lambda expression. Each of them serves a specific use case and can be used in different scenarios based on the requirement.
