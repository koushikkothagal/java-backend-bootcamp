# The List interface

## Introduction

The `List` interface is a part of the Java Collection Framework and is used to represent an ordered collection. This means that the elements are stored in a specific order, and they can be accessed by their index. The `List` interface extends the `Collection` interface and adds additional methods for working with elements by their index.

Here is an example of creating a `List` of `String`s:

```java
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // creating a list of strings
        List<String> fruits = new ArrayList<>();

        // adding elements to the list
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        // printing the list
        System.out.println(fruits);
    }
}
```

In this example, we created a List of Strings called fruits, and added elements to the list using the `add()` method. We then printed the list, which will output: `[apple, banana, orange]`.

Another way of creating a List is by using the `Arrays.asList()` method. This method creates a fixed-size list, it also accepts an array as an argument.

```java
List<String> fruits = Arrays.asList("apple", "banana", "orange");
```

You can also construct a List using `List.of`. The resultant list is immutable (it cannot change) and it doesn't allow `null` as an element.

```java
List<String> fruits = List.of("apple", "banana", "orange");
```

It is also possible to create a `List` by copying the elements from another collection.

```java
import java.util.ArrayList;
import java.util.List;

public class ListExample3 {
    public static void main(String[] args) {
        // creating a list of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        // copying elements to another list
        List<String> fruits2 = new ArrayList<>(fruits);

        // printing the list
        System.out.println(fruits2);
    }
}
```

In this example, we created a new List called `fruits2` and copied the elements from the `fruits` list to it list by passing the original list as an argument to the `ArrayList` constructor.

Note that in Java, the `List` interface is implemented by several classes, such as `ArrayList`, `LinkedList` and `Vector`. Each class has its own specific characteristics and is suited for different use cases. For example, `ArrayList` is best for frequent random access, `LinkedList` is best for frequent insertions and deletions, and `Vector` is best for thread-safe operations.

## Implementations of the List Interface

The `List` interface in Java is implemented by several classes, such as `ArrayList`, `LinkedList`, and `Vector`. Each class has its own specific characteristics and is suited for different use cases.

### ArrayList

`ArrayList` is the most commonly used implementation of the `List` interface.
It is backed by an array, which means that it has a fixed size and when the number of elements in the list exceeds its capacity, a new array is created and all elements are copied to it.
The time complexity of most operations (e.g., add, get, set) is O(1) on average and O(n) in the worst case (when the array needs to be resized).
`ArrayList` is best for frequent random access and when the number of elements in the list is relatively small.
Here is an example of creating and using an `ArrayList`:

```java
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // creating an ArrayList of strings
        List<String> fruits = new ArrayList<>();

        // adding elements to the list
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        // accessing an element by index
        System.out.println(fruits.get(1)); // output: banana

        // removing an element by index
        fruits.remove(1);
        System.out.println(fruits); // output: [apple, orange]
    }
}
```

### LinkedList

`LinkedList` is implemented as a doubly-linked list, which means that each element in the list is connected to the next and previous elements.
The time complexity of most operations (e.g., add, get, set) is O(n) on average, but some operations, like append and remove at the end of the list, can be done in O(1).
`LinkedList` is best for frequent insertions and deletions and when the number of elements in the list is relatively large.
Here is an example of creating and using a `LinkedList`:

```java
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // creating a LinkedList of strings
        List<String> fruits = new LinkedList<>();

        // adding elements to the list
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        // accessing an element by index
        System.out.println(fruits.get(1)); // O(n) operation. Output: banana

        // removing an element by index
        fruits.remove(2); //// O(1) operation.
        System.out.println(fruits); // output: [apple, banana]
    }
}
```

### Vector

`Vector` is similar to ArrayList, but it is synchronized, which means that it is thread-safe.
The time complexity of most operations (e.g., add, get, set) is O(1) on average and O(n) in the worst case (when the array needs to be resized).
`Vector` is best for thread-safe operations, when multiple threads need to access the list simultaneously.

In conclusion, `ArrayList`, `LinkedList`, and `Vector` are three implementations of the `List` interface in Java. Each class has its own specific characteristics and is suited for different use cases. `ArrayList` is best for frequent random access, `LinkedList` is best for frequent insertions and deletions, and `Vector` is best for thread-safe operations. It's important to choose the right implementation according to your specific needs to achieve better performance and avoid unnecessary overheads.

## Common Methods of the List Interface

The List interface in Java provides several methods for working with elements in a list. The most commonly used methods are:

add(E element): This method is used to add an element to the end of the list.

```java
List<String> fruits = new ArrayList<>();
fruits.add("apple");
fruits.add("banana");
fruits.add("orange");
```

add(int index, E element): This method is used to add an element at a specific position in the list.

```java
List<String> fruits = new ArrayList<>();
fruits.add("apple");
fruits.add("banana");
fruits.add(1, "pear");
```

get(int index): This method is used to retrieve an element at a specific position in the list.

```java
List<String> fruits = new ArrayList<>();
fruits.add("apple");
fruits.add("banana");
fruits.add("orange");
String secondFruit = fruits.get(1);
```

set(int index, E element): This method is used to update an element at a specific position in the list.

```java
List<String> fruits = new ArrayList<>();
fruits.add("apple");
fruits.add("banana");
fruits.add("orange");
fruits.set(1, "pear");
```

remove(int index): This method is used to remove an element at a specific position in the list.

```java
List<String> fruits = new ArrayList<>();
fruits.add("apple");
fruits.add("banana");
fruits.add("orange");
fruits.remove(1);
```

clear(): This method is used to remove all elements from the list.

```java
List<String> fruits = new ArrayList<>();
fruits.add("apple");
fruits.add("banana");
fruits.add("orange");
fruits.clear();
```

size(): This method is used to get the number of elements in the list.

```java
List<String> fruits = new ArrayList<>();
fruits.add("apple");
fruits.add("banana");
fruits.add("orange");
int size = fruits.size();
```

It's important to note that all these methods can throw an `IndexOutOfBoundsException` if the index passed as an argument is out of the range of the list.

## List Interface and Generics

The `List` interface in Java can be used with generics to create a list of a specific type of object. Generics provide a way to specify the type of elements that a list can contain, which helps to prevent type casting errors and makes the code more readable.

Here is an example of creating a `List` of Strings using generics:

```java
// creating a list of strings using generics
List<String> fruits = new ArrayList<>();
```

In this example, we used the angle brackets (< and >) to specify that the list should contain only `String`s. This makes it clear that the list can only hold elements of type `String`, and the compiler will prevent you from adding elements of any other type.

You can also create a `List` of any other type, such as `List<Integer>`, `List<Double>`, `List<CustomObject>` etc.

```java
// creating a list of integers using generics
List<Integer> numbers = new ArrayList<>();
```

## List Interface and Autoboxing

The List interface in Java can be used with autoboxing to store primitive data types. Autoboxing is a feature in Java that allows primitive data types to be automatically converted to their corresponding wrapper classes when they are used in a context where an object is expected. This means that primitive data types can be added to a List without the need to manually convert them to their corresponding wrapper classes.

Here is an example of creating a List of integers using autoboxing:

```java
import java.util.ArrayList;
import java.util.List;

public class ListAutoboxingExample {
    public static void main(String[] args) {
        // creating a list of integers using autoboxing
        List<Integer> numbers = new ArrayList<>();

        // adding elements to the list using autoboxing
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // printing the list
        System.out.println(numbers);
    }
}
```

In this example, we created a List of integers, and added `int` elements to the list using the `add()` method. The primitive int data type is automatically converted to the `Integer` wrapper class using autoboxing.

It's also possible to use autoboxing with other primitive data types such as double, float, long, short, byte and char. Here's an example of creating a List of doubles:

```java
List<Double> numbers = new ArrayList<>();

// adding elements to the list using autoboxing
numbers.add(1.1);
numbers.add(2.2);
numbers.add(3.3);
```

It's important to note that autoboxing can also be used with other collections classes as well, such as `Set` and `Map`.

## CopyOnWriteArrayList

`CopyOnWriteArrayList` is a thread-safe variant of `ArrayList` in Java. It is a concurrent collection class that uses a copy-on-write strategy, which means that all modifications to the list are made on a copy of the underlying array. This ensures that multiple threads can read the list simultaneously without the need for locks, while still allowing for safe and efficient modification. This makes `CopyOnWriteArrayList` well-suited for situations where many threads will be reading the list, but relatively few will be modifying it. However, because the array is copied on every modification, this class is less efficient than a standard `ArrayList` when modifications are frequent.

## Performance Considerations when working with the List Interface

### ArrayList performance

- add() – On average: O(1). Worst-case scenario: O(n)(when there's no space and this results in new array + copy)
- add(index, element) – On average: O(n). Worst case scenario: Same as above
- get() – O(1)
- remove() – O(n) (Both index and object based)
- indexOf() – O(n)
- contains() – O(n)

### LinkedList performance

- add() – O(1) (Append at the end)
- add(index, element) – O(n)
- get() – O(n)
- remove() – O(n) (Both index and object based)
- contains() – O(n)

Memory usage is also an important consideration when working with the `List` interface. `ArrayList` and `Vector` are backed by an array, which means that they have a fixed size and when the number of elements in the list exceeds its capacity, a new array is created and all elements are copied to it. `LinkedList`, on the other hand, is implemented as a doubly-linked list, which means that each element in the list is connected to the next and previous elements. `LinkedList` uses more memory than `ArrayList` and `Vector` because it needs to store the links between elements in addition to the elements themselves.

# Additional Functionality of the List Interface

The `List` interface in Java provides additional functionality beyond the basic operations such as `add()`, `get()`, `set()`, `remove()`, `clear()`, and `size()`. Some of these additional functionalities include:

## ListIterator

This is an interface that allows you to iterate through a list in both forward and backward directions, and also allows you to modify the list during iteration. Here's an example of using a `ListIterator` to iterate through a `List` of `String`s:

```java
import java.util.ArrayList;
import java.util.ListIterator;

public class BiDirectionalTraversal {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");

        ListIterator<String> iterator = list.listIterator();

        // Forward traversal using ListIterator
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Backward traversal using ListIterator
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
```

The above code demonstrates how to use a ListIterator to do bi-directional traversal of an ArrayList. In the forward traversal, the next() method is used to get the next element in the list, and the hasNext() method is used to check if there are more elements in the list. Similarly, in the backward traversal, the previous() method is used to get the previous element in the list, and the hasPrevious() method is used to check if there are more elements in the reverse order.

:::note
The `listIterator()` method returns an iterator that is positioned before the first element. Therefore, before starting the backward traversal, the iterator must be moved to the last element of the list using the `next()` method as many times as the list size.
:::

## SubList

This is a method that allows you to return a "slice" of the list that is a sub-list of the original list. It returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive. The returned list is backed by the original list, so changes to the original will reflect in the new one!

Here's an example of creating a sub-list of a List of strings:

```java
import java.util.ArrayList;
import java.util.List;

public class SubListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("pear");
        fruits.add("mango");
        fruits.add("kiwi");

        List<String> subList = fruits.subList(1, 4);
        System.out.println(subList); // [banana, orange, pear]

        fruits.set(1, "bananaaaaa");
        System.out.println(subList); // [bananaaaaa, orange, pear]

    }
}
```
