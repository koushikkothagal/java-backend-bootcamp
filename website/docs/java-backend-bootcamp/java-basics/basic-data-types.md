# Java Basic Data Types

Java has two types of data types: primitive and non-primitive.

## Primitive Data Types

Primitive data types are the most basic data types in Java. They include:

1. int: The int data type is used to store whole numbers (integers). It occupies 4 bytes (32 bits) of memory and has a range of -2147483648 to 2147483647.

2. double: The double data type is used to store decimal numbers (floating-point numbers). It occupies 8 bytes (64 bits) of memory and has a range of approximately +/- 5.0 x 10^-324 to +/- 1.8 x 10^308.

3. float: The float data type is used to store decimal numbers (floating-point numbers). It occupies 4 bytes (32 bits) of memory and has a range of approximately +/- 1.4 x 10^-45 to +/- 3.4 x 10^38.

4. long: The long data type is used to store whole numbers (integers). It occupies 8 bytes (64 bits) of memory and has a range of -9223372036854775808 to 9223372036854775807.

5. short: The short data type is used to store whole numbers (integers). It occupies 2 bytes (16 bits) of memory and has a range of -32768 to 32767.

6. byte: The byte data type is used to store whole numbers (integers). It occupies 1 byte (8 bits) of memory and has a range of -128 to 127.

7. char: The char data type is used to store a single character. It occupies 2 bytes (16 bits) of memory and can store any Unicode character.

8. boolean: The boolean data type can only store two values: true or false. It is used to represent true/false conditions.

## Non-Primitive Data Types

Non-primitive data types are also known as reference data types. They include:

1. String: A string is a sequence of characters. The String class is used to create and manipulate strings.
2. Array: An array is a collection of similar data types. Each element in an array is accessed by its index.
3. Class: A class is a blueprint for creating objects (a particular data structure), providing initial values for state (member variables or attributes), and implementations of behavior (member functions or methods).
4. Interface: An interface is a collection of abstract methods. A class that implements an interface must implement all its methods.
5. Enum: An enum is a special data type that allows the programmer to define a set of named values.

## Example

```java
public class DataTypes {
    public static void main(String[] args) {
        int x = 5;
        double y = 3.14;
        float z = 2.718f;
        long w = 1234567890L;
        short v = 32767;
        byte u = 127;
        char c = 'A';
        boolean b = true;

        String str = "Hello World";
        int[] nums = {1, 2, 3, 4, 5};
        String[] names = {"John", "Mary", "Bob"};
    }
}
```

It's important to choose the appropriate data type for your variables, as this can affect the memory usage and performance of your program. For example, using a `float` data type instead of a `double` can save memory if the precision of the decimal numbers is not a concern, but it may also introduce rounding errors.

:::note
While non-primitive data types such as `String`, `Array`, `Class`, `Interface`, and `Enum` are not considered primitive data types, they are still considered core or fundamental data types in Java and are built-in to the language.
:::

In addition, when declaring variables of non-primitive data types, they are actually references to objects, not the objects themselves.

For example, when declaring a `String` variable:

```java
String myString = "Hello World";
```

The variable "myString" is actually a reference to the String object "Hello World", not the object itself.

:::note
Understand the difference between a primitive and its corresponding non-primitive wrapper class. For example, the int data type has a corresponding non-primitive wrapper class called Integer. The wrapper class provides additional methods for working with the primitive data type.
:::

## Wrapper classes

Wrapper classes in Java are used to convert primitive data types into objects. All primitive types (e.g. int, float, boolean) have a corresponding wrapper class (e.g. Integer, Float, Boolean). The wrapper classes are found in the `java.lang` package and are used to perform operations that are not possible with primitive data types.

Each wrapper class has a constructor that takes a single argument, which is the primitive data type value. For example, to convert an `int` to an `Integer`, you can use the following code:

```java
int i = 10;
Integer intWrapper = new Integer(i);
```

The wrapper classes also provide methods that can be used to perform operations on the wrapped value. For example, the `Integer` class provides methods such as `intValue()`, `compareTo()`, and `valueOf()` to perform operations such as converting the wrapped value to a primitive `int`, comparing two `Integer` objects, and converting a `String` to an `Integer`.

Wrapper classes are also useful when working with collections, because collections can only store objects and not primitive data types. Wrapper classes also provide additional functionality such as autoboxing and unboxing which allows to automatically convert between primitive and wrapper classes without the need of explicit conversion.
