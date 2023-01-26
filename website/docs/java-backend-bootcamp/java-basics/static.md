# The static Keyword

The `static` keyword in Java is used to indicate that a member (field or method) of a class belongs to the class itself, rather than to any instance of the class. In other words, it is a class level rather than an object level property.

Here are some key points about the static keyword in Java:

- A static field is a field that belongs to the class, rather than any object of the class.
- A static method is a method that belongs to the class, rather than any object of the class.
- A static block is a block of code that is executed when the class is first loaded into memory.
- A static class is a nested class that is a member of its enclosing class, but does not have access to the enclosing class's instance variables.

Here are some examples of how to use the static keyword in Java:

Example 1: Static Field

```java
class MyClass {
    public static int myStaticField;
}
```

In this example, `myStaticField` is a static field that belongs to the class `MyClass`, and can be accessed using the class name, rather than an object of the class. For example:

```java
MyClass.myStaticField = 5; // sets the value of the static field
int x = MyClass.myStaticField; // gets the value of the static field
```

Example 2: Static Method

```java
class MyClass {
    public static void myStaticMethod() {
        // code goes here
    }
}
```

In this example, `myStaticMethod` is a static method that belongs to the class `MyClass`, and can be called using the class name, rather than an object of the class. For example:

```java
MyClass.myStaticMethod(); // calls the static method
```

Here's an example of a `static` block

```java
class MyClass {
    static {
        // code goes here
    }
}
```

In this example, the code inside the `static` block is executed when the class `MyClass` is first loaded into memory.

Here's an example of a `static` class.

```java
class MyOuterClass {
    static class MyStaticClass {
        // code goes here
    }
}
```

In this example, `MyStaticClass` is a static nested class that is a member of its enclosing class `MyOuterClass`. It does not have access to the enclosing class's instance variables.

## Instance vs static methods

There are two types of methods in Java: instance methods and static methods. The main difference between the two is that instance methods are associated with an instance of a class, while static methods are associated with the class itself.

Instance methods are defined in the body of a class, and they can access the state of the instance on which they are invoked. They can also access other instance methods and instance variables of the same class. Here is an example of an instance method in Java:

```java
class MyClass {
    private int x;
    private int y;

    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int sum() {
        return x + y;
    }
}
```

In this example, the class `MyClass` has an instance method called `sum()` which can be invoked on an instance of `MyClass` and it returns the sum of the instance variables `x` and `y`.

On the other hand, static methods are defined using the `static` keyword and they are associated with the class itself, not an instance of the class. They can only access static variables and other static methods of the same class. Here is an example of a static method in Java:

```java
class MyClass {
    private static int x;
    private static int y;

    public static void setX(int x) {
        MyClass.x = x;
    }

    public static void setY(int y) {
        MyClass.y = y;
    }

    public static int sum() {
        return x + y;
    }
}
```

In this example, the class `MyClass` has a static method called `sum()` which can be invoked on the class `MyClass` and it returns the sum of the static variables `x` and `y`.

It is important to note that, a static method cannot access non-static variables or methods, and also you cannot use `this` keyword in a static method because it does not have a reference to the current object.

Another important difference between instance methods and static methods is the way they are invoked. To invoke an instance method, you need to create an instance of the class first, and then invoke the method on that instance. Here's an example:

```java
MyClass myObject = new MyClass(3, 4);
int result = myObject.sum();
```

To invoke a static method, you can simply call it on the class, without creating an instance. Here's an example:

```java
MyClass.setX(3);
MyClass.setY(4);
int result = MyClass.sum();
```

In general, instance methods should be used when the method needs to access or modify the state of an object, while static methods should be used when the method needs to perform a task that does not depend on the state of an object.

Here is an example of a program that uses both instance methods and static methods:

```java
class MyClass {
    private int x;
    private int y;

    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int sum() {
        return x + y;
    }

    public static int multiply(MyClass obj) {
        return obj.x * obj.y;
    }

```

:::note
You can use `static` keyword on both variables and methods. Static variables are also called class variables, they are shared by all instances of a class, if one object modifies the value of a static variable, the change is reflected in all instances of that class.
:::

In summary, instance methods and static methods are two types of methods in Java, each with their own characteristics and uses. Instance methods are associated with an instance of a class, can access and modify the state of the instance, and are invoked on an instance of the class. Static methods are associated with the class itself, can only access and modify static variables and methods, and are invoked on the class.
