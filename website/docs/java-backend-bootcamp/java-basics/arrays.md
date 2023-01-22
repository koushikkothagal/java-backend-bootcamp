# Arrays in Java

An array is a data structure that holds a fixed number of values of the same type. These values can be accessed by their index, which is an integer value that ranges from 0 to the size of the array minus 1. In Java, arrays are objects and are created with the `new` keyword.

## Declaring an Array

```java
int[] myArray;
```

This declares a variable called `myArray` that can hold an array of integers. The square brackets `[]` indicate that it is an array.

## Initializing an Array

```java
myArray = new int[5];
```

This creates a new array of integers with a length of 5 and assigns it to the `myArray` variable.

You can also declare and initialize an array in one line:

```java
int[] myArray = new int[5];
```

## Accessing Elements in an Array:

```java
int firstElement = myArray[0];
```

This assigns the value of the first element in the `myArray` array (at index 0) to the `firstElement` variable.

## Manipulating Elements in an Array

```java
myArray[2] = 8;
```

This assigns the value of 8 to the third element (at index 2) in the `myArray` array.

## Iterating through an Array

```java
for (int i = 0; i < myArray.length; i++) {
	System.out.println(myArray[i]);
}
```

This uses a `for` loop to iterate through each element in the `myArray` array and prints out its value. The `myArray.length` property returns the length of the array.

## Multi-dimensional Arrays

Java also supports multi-dimensional arrays, also known as arrays of arrays. These can be declared and initialized as follows:

```java
int[][] my2DArray = new int[3][4];
```

This creates a 2-dimensional array with 3 rows and 4 columns. Elements can be accessed using multiple indexes, for example:

```java
int element = my2DArray[1][2];
```

This assigns the value of the element at row 1, column 2 to the `element` variable.

# Array Copying

```java
int[] array1 = {1, 2, 3, 4, 5};
int[] array2 = new int[5];
System.arraycopy(array1, 0, array2, 0, 5);
```

This copies the elements of `array1` to `array2`. The first argument is the source array, the second argument is the starting index of source array, the third argument is the destination array, the fourth argument is the starting index of destination array, and the fifth argument is the number of elements to copy.

:::note
There are several useful methods that can be used to manipulate arrays, such as `sort`, `fill`, `binarySearch`, etc. These methods are part of the `java.util.Arrays` class, and can make working with arrays much more efficient.
:::

That's all for arrays in Java. It's a simple yet powerful data structure that is widely used in many programming projects.
