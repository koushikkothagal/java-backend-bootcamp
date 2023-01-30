# Java Streams

## Introduction to Streams

Java streams provide a way of processing data that is different from the traditional collections. In this section, we will cover the basic concepts of streams, including the differences between streams and traditional collections, the main characteristics of streams, and the main methods of the `Stream` interface.

## Differences between Streams and Traditional Collections

- Streams are not a data structure, they are a way to process data. Traditional collections, such as `ArrayList` or `HashSet`, are data structures that store elements.
- Streams are designed to work with large amounts of data. They provide a way to process large collections of data in a more efficient and optimized way.
- Streams are lazy. This means that operations on a stream are not executed until a terminal operation is invoked. This allows for more efficient processing of data.
- Streams are functional. This means that they support functional-style operations, such as `filter` and `map`, and can be composed in a functional manner.
- Streams are immutable, which means that once a stream is created, its elements cannot be modified.
- Streams can be parallelized, which means that operations on a stream can be executed in parallel, allowing for more efficient processing of large amounts of data.

## Creating Streams

Streams can be created in several ways:

### From a collection

```java
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
Stream<Integer> stream = list.stream();
```

### From an array

```java
Integer[] array = {1, 2, 3, 4, 5};
Stream<Integer> stream = Arrays.stream(array);
```

### From a generator function

```java
Stream<Double> randomNumbers = Stream.generate(Math::random);
```

### From values

```java
Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
```

### From a file:

```java
Stream<String> lines = Files.lines(Paths.get("file.txt"));
```

## Main Characteristics of Streams

- A stream is a sequence of elements.
- A stream does not store its elements. It is a view of a data source such as a collection or an array.
- A stream is not modifiable, which means that its elements cannot be modified after the stream is created.
- A stream is not a data structure, it is a pipeline of operations.

## Main Methods of the Stream Interface

### filter

`filter(Predicate<T> predicate)`: This method returns a new stream that contains only the elements that satisfy the given predicate.

For example:

```java
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
Stream<Integer> evenNumbers = list.stream().filter(x -> x % 2 == 0);
```

### map

`map(Function<T, R> mapper)`: This method returns a new stream that contains the elements obtained by applying the given function to the elements of the original stream.

For example:

```java
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
Stream<String> stringNumbers = list.stream().map(x -> Integer.toString(x));
```

### flatMap

`flatMap(Function<T, Stream<R>> mapper)`: This method returns a new stream that is obtained by flattening the elements of the original stream, which are streams themselves, into a single stream.

For example:

```java
List<List<Integer>> list = Arrays.asList(
Arrays.asList(1, 2, 3),
Arrays.asList(4, 5, 6),
Arrays.asList(7, 8, 9)
);
Stream<Integer> flatStream = list.stream().flatMap(x -> x.stream());
```

### sorted

`sorted()`: This method sorts the elements of the stream in natural order.

For example:

```java
List<Integer> list = Arrays.asList(5, 2, 8, 1, 9);
Stream<Integer> sortedStream = list.stream().sorted();
```

### distinct

`distinct()`: This method returns a new stream with distinct elements based on the natural order of the elements.

For example:

```java
List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
Stream<Integer> distinctStream = list.stream().distinct();
```

### peek

`peek(Consumer<T> action)`: This method returns a new stream, which is identical to the original stream, but applies the given action to each element as they are consumed from the resulting stream. This method is useful for debugging and understanding the intermediate state of a stream during processing.

For example:

```java
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
Stream<Integer> debugStream = list.stream()
        .filter(number -> number % 2 == 0)
        .peek(evenNumber -> System.out.println("Filtered value: " + evenNumber));

debugStream.forEach(System.out::println);
/*
Output
Filtered value: 2
2
Filtered value: 4
4
*/
```

### limit

`limit(long maxSize)`: This method returns a new stream, which is a truncated version of the original stream, containing only the first maxSize elements.

For example:

```java
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
Stream<Integer> limitedStream = list.stream().limit(3);
```

### skip

`skip(long n)`: This method returns a new stream, which is a truncated version of the original stream, skipping the first n elements.

For example:

```java
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
Stream<Integer> skippedStream = list.stream().skip(3);
```

### forEach

`forEach(Consumer<T> action)`: This method performs an action for each element in the stream. For example:

```java
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
list.stream().forEach(x -> System.out.println(x));
```

### reduce

`reduce(BinaryOperator<T> accumulator)`: This method returns an Optional object that contains the result of applying the accumulator function to all elements in the stream.

For example:

```java
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
Optional<Integer> sum = list.stream().reduce((x, y) -> x + y);
```

### collect

`collect(Collector<T, A, R> collector)`: This method returns an object of type R, which is the result of applying the given collector to all elements in the stream.

For example:

```java
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> newList = list.stream().collect(Collectors.toList());
```

### count

`count()`: This method returns the number of elements in the stream.

For example:

```java
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
long count = list.stream().count();
```

### toList

`toList()`: Collects a Stream to a List

````java
```java
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> backToList = list.stream().toList();
````

These are some of the main methods of the `Stream` interface. There are many other useful methods available such as `min()`, `max()`, `average()`, `summaryStatistics()` and so on. With these methods, we can perform various operations on streams such as filtering, mapping, reducing, and collecting.

# Intermediate vs Terminal operations

One of the key concepts in understanding how streams work is understanding the difference between intermediate and terminal operations.

Intermediate operations are operations that are performed on a stream, but do not return a final result. They return a new stream, which can be used to perform additional operations. Intermediate operations are typically used to filter, map, and transform the elements of a stream. These operations are often used in conjunction with each other to create a pipeline of operations that can be used to transform and process data. Examples of intermediate operations include `filter()`, `map()`, `flatMap()`, `peek()`, `distinct()`, `sorted()`, `limit()`, `skip()` and so on.

For example, imagine we have a list of integers and we want to filter out even numbers, double the remaining numbers and then find the sum of the final results. We can use the intermediate operations `filter()`, `map()` and `reduce()` to achieve this.

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
int sum = numbers.stream()
                .filter(x -> x % 2 != 0)
                .map(x -> x * 2)
                .reduce(0, (x, y) -> x + y);
```

On the other hand, terminal operations are operations that return a final result or produce a side-effect, such as printing to the console or storing the results in a collection. Terminal operations are the final step in a pipeline of operations, and they trigger the evaluation of the stream. Examples of terminal operations include `forEach()`, `count()`, `min()`, `max()`, `average()`, `summaryStatistics()`, `findFirst()`, `findAny()`, `anyMatch()`, `allMatch()`, `noneMatch()` and so on.

For example, imagine we have a list of strings and we want to print the first element that starts with the letter 'a':

```java
List<String> words = Arrays.asList("apple", "banana", "orange", "avocado");
words.stream()
    .filter(x -> x.startsWith("a"))
    .findFirst()
    .ifPresent(System.out::println);
```

:::note
Some terminal operations need to process all the data in a stream (example: `forEach()` and `toList()`). Some others can "short circuit" and stop processing data as soon as it's job is done (example: `findFirst()`, `findAny()`)
:::

# Collectors

Java Stream Collectors is a class in the Java Standard Library that provides a set of methods for performing common reduction operations on streams, such as accumulating elements into collections, summarizing elements according to various criteria, and joining elements into a string.

One of the most common ways to use the Stream Collectors class is to accumulate the elements of a stream into a collection, such as a list or set. For example, the following code uses the `toList()` method to collect the elements of a stream of integers into a list:

```java
List<Integer> numbers = Stream.of(1, 2, 3, 4, 5)
        .collect(Collectors.toList());
```

Another example that uses `toSet()` method to collect the elements of a stream of strings into a set:

```java
Set<String> words = Stream.of("apple", "banana", "orange", "apple")
        .collect(Collectors.toSet());
```

To join the elements of a stream into a string, we can use the `joining()` method. This method takes an optional separator string as a parameter, which is used to separate the elements of the stream in the resulting string.

```java
String sentence = Stream.of("This", "is", "a", "sentence.")
        .collect(Collectors.joining(" "));
```

Additionally, we can use the `groupingBy()` method to group the elements of a stream according to a specific key, and the `counting()` method to count the number of elements in each group.

```java
Map<Integer, Long> group = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    .collect(Collectors.groupingBy(n -> n % 2, Collectors.counting()));
```

In this example, the elements of the stream are grouped by their remainder when divided by 2, and the number of elements in each group is counted. The resulting map would have the keys 0 and 1 and the values 5 and 5 respectively.

These are just a few examples of the many ways in which the Stream Collectors class can be used to perform reduction operations on streams. With its powerful methods, the Stream Collectors class provides an easy and efficient way to manipulate and analyze large datasets in Java.
