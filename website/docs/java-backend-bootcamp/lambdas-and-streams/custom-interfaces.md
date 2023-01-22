# Custom Functional Interfaces

A functional interface is an interface that contains exactly one abstract method. In Java 8, several functional interfaces were added to the java.util.function package, such as `Predicate`, `Consumer`, and `Function`. However, in certain situations, you may need to create your own functional interface. In this section, we will cover how to create custom functional interfaces and provide examples of their use.

## Creating a Custom Functional Interface

Creating a custom functional interface is simple. First, define an interface with a single abstract method. Next, annotate the interface with the `@FunctionalInterface` annotation. This annotation is optional, but it provides an additional level of type safety by ensuring that the interface can only be implemented by exactly one abstract method.

```java
@FunctionalInterface
interface MyFunctionalInterface {
	void doSomething();
}
```

You can also add default and static methods to the functional interface, but they do not count towards the single abstract method requirement.

```java
@FunctionalInterface
interface MyFunctionalInterface {
	void doSomething();
	default void doSomethingElse() {
        // implementation
    }
    static void doAnotherThing() {
        // implementation
    }
}
```

## Using a Custom Functional Interface

Once you have defined a custom functional interface, you can implement it using a lambda expression or a method reference.

```java
MyFunctionalInterface myFunction = () -> System.out.println("Hello World!");
myFunction.doSomething();

// or

MyFunctionalInterface myFunction = System.out::println;
myFunction.doSomething();
```

You can also use the interface as a type for method arguments or return values.

```java
class MyClass {
    public void doSomething(MyFunctionalInterface myFunction) {
        myFunction.doSomething();
    }
}

MyClass myObject = new MyClass();
myObject.doSomething(() -> System.out.println("Hello World!"));
```

## Examples

1.  Creating a functional interface for a comparison operation:

```java
@FunctionalInterface
interface Comparator<T> {
    int compare(T o1, T o2);
}
```

2.  Creating a functional interface for a mathematical operation:

```java
@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}
```

In conclusion, creating a custom functional interface is a simple process that can add an additional level of type safety to your code. They are useful for situations where the pre-existing functional interfaces in the java.util.function package do not meet your needs.

:::note
You can also use these custom functional interface as a type for method arguments or return values.
:::

```java
class Calculator {
	public int calculate(MathOperation mathOperation, int a, int b) {
		return mathOperation.operation(a, b);
	}
}
```

You can pass lambda expressions to the method, for example:

```java
Calculator calculator = new Calculator();
int result = calculator.calculate((a, b) -> a + b, 5, 7);
```

This way you can pass any mathematical operation you want to perform on the example provided above,

```java
Calculator calculator = new Calculator();

MathOperation addition = (a, b) -> a + b;
MathOperation subtraction = (a, b) -> a - b;
MathOperation multiplication = (a, b) -> a * b;
MathOperation division = (a, b) -> a / b;

int result1 = calculator.calculate(addition, 5, 7);
int result2 = calculator.calculate(subtraction, 5, 7);
int result3 = calculator.calculate(multiplication, 5, 7);
int result4 = calculator.calculate(division, 5, 7);

System.out.println("Addition: " + result1);
System.out.println("Subtraction: " + result2);
System.out.println("Multiplication: " + result3);
System.out.println("Division: " + result4);
```

As you can see, the custom functional interface allows us to pass any mathematical operation we want to perform as a method argument. This allows for more flexibility and modularity in our code, as we can easily swap out different operations without changing the rest of our code.

:::note
Functional interfaces are useful when working with streams in Java 8. The Stream API has several methods that take functional interfaces as arguments, such as filter(), map(), and reduce(). By creating custom functional interfaces, you can pass your own logic to these methods and manipulate streams in a more powerful and efficient way.
:::

In summary, creating custom functional interfaces can be a powerful tool for writing more flexible, modular and efficient code. With functional interfaces, you can create reusable blocks of code that can be passed around as method arguments, making your code more modular and easier to test.
