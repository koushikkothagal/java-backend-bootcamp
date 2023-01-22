# Comparable and Comparator

In Java, `Comparable` and `Comparator` are two interfaces that are used to sort collections of objects.

`Comparable` is a built-in interface in Java that is used to define the natural ordering of objects. When an object implements the `Comparable` interface, it is able to compare itself to other objects of the same type and determine which one is "greater" or "lesser". The compareTo() method defined by the `Comparable` interface is used to perform the comparison.

For example, if a class Person implements the `Comparable` interface and defines a `compareTo()` method that compares two `Person` objects based on their age, then a list of `Person` objects can be sorted by age using the `Collections.sort()` method.

```java
class Person implements Comparable<Person> {
    private int age;
    private String name;

    // constructor and getters

    @Override
    public int compareTo(Person other) {
        return this.age - other.age;
    }
}

List<Person> people = new ArrayList<>();
people.add(new Person(25, "John"));
people.add(new Person(30, "Jane"));
people.add(new Person(20, "Bob"));
Collections.sort(people);
```

On the other hand, `Comparator` is a separate interface that can be used to define a custom sorting order for a class that does not implement `Comparable`. It is useful when the natural ordering of a class is not the ordering that we desire. A `Comparator` can be defined as a separate class or as an anonymous inner class. The `compare()` method is used to perform the comparison.

```java
class Person {
    private int age;
    private String name;
    // constructor and getters
}

List<Person> people = new ArrayList<>();
people.add(new Person(25, "John"));
people.add(new Person(30, "Jane"));
people.add(new Person(20, "Bob"));
Collections.sort(people, new Comparator<Person>() {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
});
```

In the above example, the `Person` class doesn't implement `Comparable` (or it might and we want a different order!) and the `List` is sorted by name using a comparator.

In summary, the `Comparable` interface is used to define the natural ordering of objects, while the `Comparator` interface can be used to define a custom sorting order for objects that do not implement Comparable.
