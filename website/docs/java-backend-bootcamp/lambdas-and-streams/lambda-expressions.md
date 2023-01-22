# Lambda Expressions

## Introduction

Lambda expressions are a way to simplify the creation of functional interfaces. A lambda expression is a shorthand syntax for creating an anonymous function. It consists of an optional list of parameters, the arrow token (`->`), and a body.

The basic syntax of a lambda expression is as follows:

`(parameters) -> { body }`

Lambda expressions can be used wherever a functional interface is expected. A functional interface is an interface that has exactly one abstract method. For this reason, functional interfaces are referred to as Single Abstract Method Interfaces (or SAM interfaces). The Java library includes several functional interfaces in the `java.util.function` package, such as `Function`, `Consumer`, `Supplier`, `Predicate`, and `Operator`.

Examples:

```java
// Using a lambda expression to define a Function
Function<Integer, Integer> add = (x) -> x + 1;
System.out.println(add.apply(1)); // Output: 2

// Using a lambda expression to define a Consumer
Consumer<String> print = (s) -> System.out.println(s);
print.accept("Hello, World!"); // Output: "Hello, World!"
```

:::note
A functional interface is an interface that has exactly one abstract method. For this reason, functional interfaces are referred to as Single Abstract Method Interfaces (or SAM interfaces). They can have multiple default and static methods though!
:::

## Functional Interfaces

Functional interfaces are a key feature of the Java 8 programming language, and they are used in the implementation of streams and lambda expressions. There are four main kinds of functional interfaces in Java:

- Function
- Predicate
- Consumer
- Supplier

Each of these interfaces serves a specific purpose and can be used in different ways to perform various operations on streams and data.

### Function

The Function interface is used to represent a function that takes one argument and produces a result. It is typically used to transform elements in some way.

`Function<T, R>` - Represents a function that takes in one argument of type T and returns a result of type R. It has the following method:

```java
R apply(T t)
```

Example

```java
Function<Integer, Integer> add = (x) -> x + 1;
System.out.println(add.apply(1)); // Output: 2
```

There is a related interface `BiFunction` that is same as `Function` except that represents a function that takes two arguments.

```java
R apply(T t, U u)
```

### Predicate

The Predicate interface is used to represent a boolean-valued function of one argument.

`Predicate<T>` - Represents a function that takes in one argument of type T and returns a boolean. It has the following method:

```java
boolean test(T t)
```

Example

```java
Predicate<Integer> isEven = (x) -> x % 2 == 0;
System.out.println(isEven.test(2)); // Output: true`
```

`BiPredicate` represents a predicate (boolean-valued function) of two arguments. This is the two-arity specialization of Predicate.

```java
boolean test(T t, U u)
```

### Consumer

The `Consumer` interface is used to represent an operation that accepts a single input argument and returns no result. Since it doesn't return anything, it is meant to operate via "side effects", like printing to console, for example.

`Consumer<T>` - Represents an operation that takes in one argument of type T and returns no result. It has the following method:

```java
void accept(T t)
```

```java
Consumer<String> print = (s) -> System.out.println(s);
print.accept("Hello, World!"); // Output: "Hello, World!"
```

`BiConsumer` represents an operation that accepts two input arguments and returns no result. This is the two-arity specialization of Consumer. Like `Consumer`, `BiConsumer` is expected to operate via side-effects.

```java
void accept(T t, U u)
```

### Supplier

The Supplier interface is used to represent a supplier of results. It is typically used to generate new elements.

`Supplier<T>` - Represents a supplier of results of type T. It has the following method:

```java
T get()
```

Example

```java
Supplier<String> supplier = () -> "Hello, World!";
System.out.println(supplier.get()); // Output: "Hello, World!"
```

### Variants and specializations

#### Data type based specialization

Example: `DoubleFunction` represents a function that accepts a double-valued argument and produces a result. Also `IntFunction`, `LongFunction`, `LongToIntFunction` etc

#### "Operators"

Example: `UnaryOperator` represents an operation on a single operand that produces a result of the same type as its operand. This is a specialization of `Function` for the case where the operand and result are of the same type.

It has the following method: `T apply(T t)` .

```java
UnaryOperator<Integer> square = (x) -> x * x;
System.out.println(square.apply(2)); // Output: 4
```

These functional interfaces are just examples of the ones provided in the package, there are many more that can be used in different situations to make the code more readable and maintainable.

## Method Reference

A method reference is a shorthand syntax for a lambda expression that calls an existing method. It uses the double colon operator (`::`) to refer to a method by its name.

There are four types of method references:

1. Reference to a static method: `ClassName::staticMethodName`

```java
// Using a method reference to a static method
BiFunction<Integer, Integer, Integer> add = Integer::sum;
System.out.println(add.apply(1, 2)); // Output: 3
```

2. Reference to an instance method of a particular object: `object::instanceMethodName`

```java
String str = "Hello";
// Using a method reference to an instance method
Supplier<Integer> length = str::length;
System.out.println(length.get()); // Output: 5
```

3. Reference to an instance method of an arbitrary object of a particular type: `ClassName::instanceMethodName`

```java
List<String> strings = Arrays.asList("hi", "hello", "hey");
// Using a method reference to an instance method
strings.forEach(System.out::println);
```

4. Reference to a constructor: `ClassName::new`

```java
Supplier<StringBuilder> supplier = StringBuilder::new;
StringBuilder sb = supplier.get();
```

Lambda expressions and method references are a powerful feature that simplify the creation of functional interfaces. They provide a concise and expressive way to define anonymous functions and enable functional programming idioms in Java.
