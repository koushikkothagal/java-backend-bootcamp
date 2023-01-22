# Advanced Concepts

In this section, we will cover advanced topics in lambda expressions and functional interfaces, including type inference, variable capture, and functional composition.

## Type Inference

Type inference is a feature that allows the compiler to infer the types of the parameters and return value of a lambda expression. This means that the programmer does not have to explicitly specify the types of the parameters and return value, and the compiler can deduce them from the context in which the lambda expression is used. This can make code using lambda expressions shorter and more readable.

For example, if a lambda expression is assigned to a functional interface that takes a single parameter of type Integer, the compiler will infer that the lambda expression takes a single parameter of type Integer.

Type inference also applies to the return type of a lambda expression. If the body of the lambda expression is a single expression, the compiler will infer the return type based on the type of that expression. If the body of the lambda expression is a block of code, the return type must be explicitly specified using the return keyword.

```java
// Example of type inference
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.stream().map(n -> n * 2).forEach(System.out::println);
```

In the example above, the compiler is able to infer the type of the variable "n" based on the context in which it is used. It knows that "n" is an integer, because it is being used in the map() method of a stream of `Integer`s.

The `forEach` method also uses type inference. We've use a method reference instead of a lambda expression and the type of the parameter is inferred by the compiler, which is Integer as well.

It is worth noting that type inference is not only limited to lambda expressions, it also applies to method references, constructors references and generic methods invocation.

## Variable Capture

Variable capture is a feature that allows a lambda expression to access variables from the enclosing scope. This can be useful, but it also has certain limitations and can lead to unexpected behavior if not used correctly.

```java
// Example of variable capture
int factor = 2;
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.stream().map(n -> n * factor).forEach(System.out::println);
```

In the example above, the lambda expression is able to access the variable "factor" from the enclosing scope. However, it's important to note that the lambda expression is only able to access variables that are effectively final, meaning that their value cannot be changed after the lambda expression is defined.

## Functional Composition

Functional composition is the process of combining multiple functions to create a new function. This can be useful for creating reusable blocks of code that can be easily composed and reused.

```java
// Example of functional composition
Function<Integer, Integer> multiplyBy2 = n -> n * 2;
Function<Integer, Integer> add3 = n -> n + 3;
Function<Integer, Integer> multiplyBy2AndAdd3 = multiplyBy2.andThen(add3);

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.stream().map(multiplyBy2AndAdd3).forEach(System.out::println);
```

In the example above, we have defined two functions, "multiplyBy2" and "add3", that take an integer as input and return an integer as output. We then use the `andThen()` method to compose these functions into a new function, "multiplyBy2AndAdd3". This new function takes an integer as input, multiplies it by 2 and then adds 3 to it.

Functional composition is a powerful technique that can be used to create more modular and reusable code, as well as to make it more readable and maintainable by breaking it down into small, focused functions.

In conclusion, Type inference, variable capture, and functional composition are advanced topics in lambda expressions and functional interfaces that can help you write more concise, expressive and reusable code. By using type inference, you can reduce the amount of boilerplate code needed to define variables and expressions, By using variable capture, you can access variables from the enclosing scope, but it's important to note that the lambda expression is only able to access variables that are effectively final. And by using functional composition, you can combine multiple functions to create a new function that can be easily composed and reused. It is important to understand the behavior and limitations of these advanced topics in order to make the most of the functional features of Java 8, and improve the readability, maintainability and performance of your code.
