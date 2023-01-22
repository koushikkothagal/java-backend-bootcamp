# Java Operators

Java has a variety of operators that can be used to perform operations on variables and values. These operators can be grouped into three main categories:

## Arithmetic Operators

These operators are used to perform mathematical operations on numeric values. The basic arithmetic operators include:

- Addition (`+`)
- Subtraction (`-`)
- Multiplication (`*`)
- Division (`/`)
- Modulus (`%`), which returns the remainder of a division operation
- Increment (`++`)
- Decrement (`--`)

Example:

```java
int x = 5;
int y = 10;
int result = x + y; // result is 15
int remainder = x % y; // remainder is 5
x++; // x is now 6
y--; // y is now 9
```

## Relational Operators

These operators are used to compare values and determine their relationship. The relational operators include:

- Equal to (`==`)
- Not equal to (`!=`)
- Greater than (`>`)
- Less than (`<`)
- Greater than or equal to (`>=`)
- Less than or equal to (`<=`)

Example:

```java
int x = 5;
int y = 10;
boolean isEqual = x == y; // isEqual is false
boolean isGreater = x > y; // isGreater is false
```

## Logical Operators

These operators are used to combine multiple relational expressions and determine the logic between them. The logical operators include:

- Logical AND (`&&`)
- Logical OR (`||`)
- Logical NOT (`!`)

Example:

```java
int x = 5;
int y = 10;
boolean isTrue = x < y && x > 0; // isTrue is true
boolean isFalse = x > y || x < 0; // isFalse is false
boolean isNotTrue = !(x < y); // isNotTrue is false
```

:::note
The precedence of operators in Java follows the standard order of operations, also known as PEMDAS (Parentheses, Exponents, Multiplication, Division, Addition, Subtraction). Operators with higher precedence are evaluated first. Parentheses can be used to change the order of operations.
:::

In addition to these basic operators, Java also has several other operators such as the ternary operator ( `? :` ), the `instanceof` operator, and the operator(s) for bit manipulation.

In summary, operators in Java are used to perform operations on variables and values. These operators can be grouped into three main categories: arithmetic, relational, and logical operators. It's important to understand the different operators and their usage, as well as their precedence in order to write accurate and efficient code.

## Ternary operator

Ternary operator ( `? :` ) is a shorthand way of writing an `if`-`else` statement. It is also called the conditional operator.

The syntax for the ternary operator is:

```
variable = (condition) ? value-if-true : value-if-false;
```

It works by evaluating the condition, if the condition is true, the operator returns the value before the colon (`:`), otherwise, it returns the value after the colon.

Example:

```java
int x = 5;
int y = 10;
int min;
min = (x < y) ? x : y; // min is 5
```

In this example, the condition (`x < y`) is evaluated as true, so the operator returns the value of `x`, which is 5. So the variable `min` is assigned the value 5.

:::note
The ternary operator is an expression, not a statement, which means it returns a value, and this value can be used in further operations.
:::

In summary, the ternary operator ( `? :` ) is a shorthand way of writing an if-else statement. It evaluates the condition and returns a value based on the result, making the code more concise and readable. It's important to understand the syntax and usage of the ternary operator to write efficient and effective code.
