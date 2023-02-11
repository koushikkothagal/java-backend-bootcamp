# Object equality and hashcode

## Object equality

In Java, two objects are considered equal if they are the same instance. However, we tend to perceive objects equal if their states are the same. The state of an object includes the values of its fields, and the state of any objects referenced by those fields. By default, the equality of two objects is determined by comparing their memory addresses using the `==` operator. But, this default behavior can be overridden by implementing the `equals()` method.

The `equals()` method is a method defined in the `Object` class, which is the parent class of all objects in Java. The method is used to determine if two objects are equal. The default implementation of the `equals()` method compares the memory addresses of the two objects using the `==` operator. This means that, by default, `equals()` deems two objects equal only if they are the same instance.

However, in many cases it's necessary to determine if two objects are equal based on their state rather than their memory addresses. To do this, the `equals()` method can be overridden in a class to provide a custom implementation of equality.

For example, consider the following class representing a point in 2D space:

```java
public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
```

By default, two `Point` objects are only considered equal if they are the same instance.

```java
Point p1 = new Point(1, 2);
Point p2 = new Point(1, 2);
System.out.println(p1 == p2); // false
```

However, we may want to consider two Point objects equal if they have the same x and y values. To do this, we can override the `equals()` method in the Point class:

```java
@Override
public boolean equals(Object obj) {
    if (obj instanceof Point) {
        Point other = (Point) obj;
        return this.x == other.x && this.y == other.y;
    }
    return false;
}
```

Now, when we compare two Point objects using the `equals()` method, it compares their x and y values, rather than their memory addresses.

```java
Point p1 = new Point(1, 2);
Point p2 = new Point(1, 2);
System.out.println(p1.equals(p2)); // true
```

It's important to note that when overriding the `equals()` method, it's also necessary to override the `hashCode()` method. The `hashCode()` method is used by Java collections such as HashMap and HashSet to determine the location of an object in their internal data structures. If the `equals()` method is overridden, the `hashCode()` method should also be overridden to ensure that two equal objects have the same hash code.

In conclusion, the definition of object equality in Java is determined by the implementation of the `equals()` method. By default, objects are only considered equal if they are the same instance, but this default behavior can be overridden by providing a custom implementation of the `equals()` method. When overriding the `equals()` method, it's also necessary to override the `hashCode()` method to ensure that equal objects have the same hash code. This will ensure that the objects behave correctly when used with Java collections.

## The contract of the `equals()` method

When overriding the `equals()` method in a custom class, it's important to follow a specific contract to ensure that the method behaves correctly.

The contract of the `equals()` method includes the following:

1.  Reflexivity: For any non-null reference value x, x.equals(x) should return true. This means that an object should be equal to itself.

```java
Point p1 = new Point(1, 2);
System.out.println(p1.equals(p1)); // true
```

2.  Symmetry: For any non-null reference values x and y, x.equals(y) should return true if and only if y.equals(x) returns true. This means that if object x is equal to object y, then object y should also be equal to object x.

```java
Point p1 = new Point(1, 2);
Point p2 = new Point(1, 2);
System.out.println(p1.equals(p2)); // true
System.out.println(p2.equals(p1)); // true
```

3.  Transitivity: For any non-null reference values x, y, and z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) should return true. This means that if object x is equal to object y and object y is equal to object z, then object x should also be equal to object z.

```java
Point p1 = new Point(1, 2);
Point p2 = new Point(1, 2);
Point p3 = new Point(1, 2);
System.out.println(p1.equals(p2)); // true
System.out.println(p2.equals(p3)); // true
System.out.println(p1.equals(p3)); // true
```

4.  Consistency: The `equals()` method should return the same result for the same input, unless the state of the object has been modified. This means that if object x is equal to object y at one point in time, it should also be equal to object y at a later point in time, assuming the state of the object has not been modified.

```java
Point p1 = new Point(1, 2);
Point p2 = new Point(1, 2);
System.out.println(p1.equals(p2)); // true
p1.x = 3;
System.out.println(p1.equals(p2)); // false
p1.x = 1;
System.out.println(p1.equals(p2)); // true
```

5.  Non-nullity: The `equals()` method should never return true when passed a null value. This means that an object should never be considered equal to null.

```java
Point p1 = new Point(1, 2);
System.out.println(p1.equals(null)); // false
```

:::note
While not strictly a rule for the `equals()` method itself, if the `equals()` method is overridden, the `hashCode()` method should also be overridden to ensure that two equal objects have the same hash code. This will ensure that the objects behave correctly when used with Java collections.
:::

In conclusion, the contract of the `equals()` method is a set of rules that must be followed when overriding the method in a custom class. Following this contract ensures that the `equals()` method behaves correctly and that objects can be compared for equality in a consistent and reliable way.

## The relationship between equality and hash code

The concept of equality is determined by the implementation of the `equals()` method.

However, when working with Java collections such as `HashMap` and `HashSet`, it's important to consider the relationship between equality and hash code. The hash code of an object is an integer value that is used to determine the location of an object in the internal data structures of these collections.

When two objects are equal according to the `equals()` method, they should also have the same hash code. This means that if two objects are considered equal, their hash code should return the same value.

For example, consider the following class representing a point in 2D space:

```java
public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point other = (Point) obj;
            return this.x == other.x && this.y == other.y;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
```

Here, we have overridden the `equals()` and `hashCode()` method and both methods are based on the state of the object, x and y. When we use these objects as key in `HashMap` and `HashSet`, they will be considered equal as well as their hashcode will be same.

If two objects are not equal according to the `equals()` method, they should also have different hash codes. This means that if two objects are not considered equal, their hash code should return different values.

## Hashcode options

There are several methods and classes available for generating hash codes for objects. The most commonly used ones are:

1.  Just use the default `hashCode()` method: This is a method defined in the `Object` class, which is the parent class of all objects in Java. The default implementation of the `hashCode()` method generates a hash code based on the memory address of the object. However, when overriding the `equals()` method in a custom class, it's necessary to also override this `hashCode()` method. Remember: equal objects need to have the same hash code.
2.  The `Objects.hashCode()` method: This is a static utility method in the `Objects` class. It takes an argument and returns the hashcode for that instance. It's null-safe, unlike the previous method which throws a `NullPointerException` if the object reference is null.
3.  The `Objects.hash()` method: This is a static utility method in the `Objects` class. It generates a hash code for a set of objects, which can be useful when generating a hash code for an object that contains multiple fields. The method takes a variable number of arguments, and each argument is used to compute the hash code.

## The impact of equality on different types of collections

The behavior of equality can have a significant impact on different types of collections, such as lists, sets, and maps.

1.  Lists: Lists have a method `contains` which accepts an object instance and return true if that instance exists in the list. When comparing the input object reference, the `equals()` method is used to determine if the element matches any of the elements present in the list.

For example, consider the following code:

```java
List<Point> list = new ArrayList<>();
list.add(new Point(1, 2));
System.out.println(list.contains(new Point(1, 2))); // true
```

Here, the two Point objects are considered equal according to the `equals()` method, and so `contains` returns true.

2.  Sets: Sets such as HashSet and TreeSet are collections of unique elements. When adding an element to a set, the `equals()` method is used to determine if the element is already present in the set. If the element is not present, it is added to the set. If the element is already present, it is not added.

For example, consider the following code:

```java
Set<Point> set = new HashSet<>();
set.add(new Point(1, 2));
set.add(new Point(1, 2));
System.out.println(set); // [Point(1, 2)]
```

Here, the two `Point` objects are considered equal according to the `equals()` method, and only one of them is added to the set.

3. Maps: Maps such as `HashMap` and `TreeMap` are collections of key-value pairs, where each key is unique. When adding a key-value pair to a map, the `equals()` method is used to determine if the key is already present in the map. If the key is not present, the key-value pair is added to the map. If the key is present, the associated value is updated.

For example, consider the following code:

```java
Map<Point, String> map = new HashMap<>();
map.put(new Point(1, 2), "A");
map.put(new Point(1, 2), "B");
System.out.println(map); // {Point(1, 2)=B}`
```

Here, the two `Point` objects are considered equal according to the `equals()` method, and the second key-value pair overwrites the first one.
