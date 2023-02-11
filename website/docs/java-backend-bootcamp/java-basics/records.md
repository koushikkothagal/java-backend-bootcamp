# Records

Records are a compact and easy-to-use way to create simple data classes that have only private fields and a public constructor, and no methods.

:::note
Records was introduced in Java 14 as a preview feature and is available from Java 17 onwards
:::

A record class is a shallowly immutable, transparent carrier for a fixed set of values, called the record components. The point of a record instance is to carry the values for its member variables that uniquely represent the instance entirely.

Here is an example of a simple record in Java:

```java
record Point(int x, int y) {}
```

This creates a record called Point with two private fields, x and y, and a public constructor that takes two int arguments.

The fields are automatically generated as private final, and the constructor is automatically generated to initialize the fields with the arguments passed to it. The record also automatically gets methods like `equals()`, `hashCode()`, and `toString()` methods that are derived from _all_ of the component fields.

```java
Point point1 = new Point(1, 2);
Point point2 = new Point(1, 2);
System.out.println(point1.equals(point2)); // prints true
```

In addition, records also support a convenient way to access the fields by providing accessors for each field.

```java
Point point1 = new Point(1, 2);
System.out.println(point1.x());
```

It is also possible to provide custom implementations for the automatically generated methods.

```java
record Point(int x, int y) {
    public int getX() { return x; }
    public int y() { return y; }
    public boolean equals(Object o) {
        if (!(o instanceof Point)) return false;
        Point other = (Point) o;
        return x == other.x && y == other.y;
    }
}
```

:::note
Records are not meant to replace classes, but to provide a simpler and more concise way of expressing simple data classes. They are not intended to have methods or be extended.
:::

In summary, records allow you to create simple data classes with private fields, a public constructor and automatically generated methods. They provide a more concise and convenient way of expressing simple data classes, while still allowing for custom implementations of the automatically generated methods.
