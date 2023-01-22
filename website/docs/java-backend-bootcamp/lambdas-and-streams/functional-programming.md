# Functional programming

## Introduction to Functional Programming

Functional programming is a programming paradigm that emphasizes the use of pure functions, which are functions that have no side effects and always return the same output for the same input. In functional programming, the primary way of creating and manipulating values is through the use of functions.

Functional programming is a declarative programming paradigm, which means that the programmer specifies what should be done, rather than how it should be done. In contrast, imperative programming is a programming paradigm in which the programmer specifies how to accomplish a task.

Functional programming has its roots in lambda calculus, a formal system developed by Alonzo Church in the 1930s to study the concept of functions and their properties.

Functional programming has gained popularity in recent years due to its ability to simplify complex problems, improve code readability, and enable better support for parallelism and concurrency.

## Main Concepts

### First-class functions

In functional programming, functions are first-class citizens, which means that they can be used as values just like any other data type. They can be passed as arguments to other functions, returned as values from functions, and stored in data structures.

Example:

```java
// Defining a function
Function<Integer, Integer> add = (x) -> x + 1;

// Using the function
System.out.println(add.apply(1)); // Output: 2

// Storing the function in a list
List<Function<Integer, Integer>> functions = new ArrayList<>();
functions.add(add);

```

### Higher-order functions

A higher-order function is a function that takes one or more functions as arguments and/or returns a function as a result. Higher-order functions are a key feature of functional programming as they allow for the abstraction and reuse of common functionality.

Example:

```java
// Defining a higher-order function
Function<Function<Integer, Integer>, Function<Integer, Integer>> compose = (f, g) -> (x) -> f.apply(g.apply(x));

// Using the higher-order function
Function<Integer, Integer> add = (x) -> x + 1;
Function<Integer, Integer> square = (x) -> x * x;
Function<Integer, Integer> composed = compose.apply(add, square);
System.out.println(composed.apply(2)); // Output: 5
```

### Closures

A closure is a function that captures the values of one or more variables from its surrounding scope. Closures are used to create stateful functions that can be passed around like regular functions.

Example:

```java
// Defining a closure
Function<Integer, Integer> counter() {
    int count = 0;
    return (x) -> count++;
}

// Using the closure
Function<Integer, Integer> add = counter();
System.out.println(add.apply(1)); // Output: 1
System.out.println(add.apply(1)); // Output: 2
```

Functional programming is a programming paradigm that emphasizes the use of pure functions and functional values. By using functional concepts such as first-class functions, higher-order functions, and closures, functional programming allows for more readable, composable and maintainable code.
