# Time Complexity and Big O

## Introduction to Time Complexity

Time complexity is a way to measure the efficiency of an algorithm in terms of the amount of time it takes to execute as a function of the input size. The time complexity of an algorithm is typically expressed using the Big O notation, which describes the upper bound on the number of operations performed by the algorithm as the input size grows.

There are several factors that can affect the time complexity of an algorithm, including the number of operations performed, the size of the input, and the specific operations being performed.

### Analyzing Time Complexity

Analyzing time complexity can be done by counting the number of operations performed by the algorithm as a function of the input size.

For example, consider the following algorithm that calculates the sum of the elements in an array:

```java
public int sumArray(int[] arr) {
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
        total += arr[i];
    }
    return total;
}

```

The number of operations performed by this algorithm is directly proportional to the size of the input array. Specifically, the algorithm performs one addition operation for each element in the array. Therefore, the time complexity of this algorithm is a function of n, where n is the size of the input array.

Another way to analyze the time complexity of an algorithm is to use the "big O" notation. The big O notation provides an upper bound on the number of operations performed by the algorithm as the input size grows. For example, the time complexity of the `sumArray()` algorithm is O(n) because the number of operations performed is directly proportional to the size of the input array.

## Common Time Complexities

There are several common time complexities that are used to describe the efficiency of algorithms, including:

- O(1): Constant time complexity, meaning the number of operations performed is independent of the input size.
- O(log n): Logarithmic time complexity, meaning the number of operations performed is logarithmic in the input size.
- O(n): Linear time complexity, meaning the number of operations performed is directly proportional to the input size.
- O(n log n): Log-linear time complexity, meaning the number of operations performed is the product of the input size and the logarithm of the input size.
- O(n^2): Quadratic time complexity, meaning the number of operations performed is the square of the input size.
- O(2^n): Exponential time complexity, meaning the number of operations performed is a power of two in the input size.

For example, consider the following algorithm that sorts an array using the bubble sort algorithm:

```java
public void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}
```

The number of operations performed by this algorithm is directly proportional to the size of the input array and the number of iterations. Specifically, the outer loop iterates n times and the inner loop iterates n-i-1 times, so the total number of operations is n(n-1)/2. Therefore, the time complexity of this algorithm is O(n^2).

:::note
In practice, the actual time complexity of an algorithm may be different from the time complexity calculated using the big O notation. The big O notation provides an upper bound on the number of operations performed, but it does not take into account constant factors or lower order terms.
:::

## Common time complexities and their Big O notation with examples

### O(1) - Constant time complexity

An algorithm has a time complexity of O(1) if the number of operations performed is independent of the input size. This means that the algorithm takes the same amount of time to execute regardless of the size of the input.

For example, consider the following algorithm that returns the first element of an array:

```java
public int getFirst(int[] arr) {
    return arr[0];
}

```

The number of operations performed by this algorithm is independent of the size of the input array. Specifically, the algorithm performs a single array access operation, regardless of the size of the array. Therefore, the time complexity of this algorithm is O(1).

### O(n) - Linear time complexity

An algorithm has a time complexity of O(n) if the number of operations performed is directly proportional to the input size. This means that the algorithm takes roughly the same amount of time to execute for each additional element in the input.

For example, consider the following algorithm that calculates the sum of the elements in an array:

```java
public int sumArray(int[] arr) {
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
        total += arr[i];
    }
    return total;
}

```

The number of operations performed by this algorithm is directly proportional to the size of the input array. Specifically, the algorithm performs one addition operation for each element in the array. Therefore, the time complexity of this algorithm is O(n), where n is the size of the input array.

### O(log n) - Logarithmic time complexity

An algorithm has a time complexity of O(log n) if the number of operations performed is logarithmic in the input size. This means that the algorithm takes roughly the same amount of time to execute for a large range of input sizes.

For example, consider the following algorithm that uses a binary search to find a specific element in a sorted array:

```java
public int binarySearch(int[] arr, int x) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] < x) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return -1;
}

```

The number of operations performed by this algorithm is logarithmic in the size of the input array. Specifically, the algorithm performs a binary search, which reduces the search space by half with each iteration. Therefore, the time complexity of this algorithm is O(log n), where n is the size of the input array.

### O(n log n) - Log-linear time complexity

An algorithm has a time complexity of O(n log n) if the number of operations performed is the product of the input size and the logarithm of the input size. This means that the algorithm takes longer to execute for larger input sizes, but not as quickly as a linear time complexity.

For example, consider the following algorithm that sorts an array using the merge sort algorithm:

```java
public void mergeSort(int[] arr) {
    if (arr.length <= 1) {
        return;
    }
    int mid = arr.length / 2;
    int[] left = Arrays.copyOfRange(arr, 0, mid);
    int[] right = Arrays.copyOfRange(arr, mid, arr.length);
    mergeSort(left);
    mergeSort(right);
    merge(arr, left, right);
}

public void merge(int[] arr, int[] left, int[] right) {
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < left.length && j < right.length) {
        if (left[i] < right[j]) {
            arr[k] = left[i];
            i++;
        } else {
            arr[k] = right[j];
            j++;
        }
        k++;
    }
    while (i < left.length) {
        arr[k] = left[i];
        i++;
        k++;
    }
    while (j < right.length) {
        arr[k] = right[j];
        j++;
        k++;
    }
}

```

The number of operations performed by this algorithm is the product of the input size and logarithm of the input size. Specifically, the algorithm performs a divide and conquer strategy, which divides the input array into two smaller arrays, sorts them and then merge them back. Each division takes log(n) operations and each merge takes n operations, so the total number of operations is n log(n). Therefore, the time complexity of this algorithm is O(n log n), where n is the size of the input array.

### O(n^2) - Quadratic time complexity

An algorithm has a time complexity of O(n^2) if the number of operations performed is the square of the input size. This means that the algorithm takes significantly longer to execute for larger input sizes.

For example, consider the following algorithm that sorts an array using the bubble sort algorithm:

```java
public void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

```

The number of operations performed by this algorithm is directly proportional to the size of the input array and the number of iterations. Specifically, the outer loop iterates n times and the inner loop iterates n-i-1 times, so the total number of operations is n(n-1)/2. Therefore, the time complexity of this algorithm is O(n^2), where n is the size of the input array.

### O(2^n) - Exponential time complexity

An algorithm has a time complexity of O(2^n) if the number of operations performed is a power of two in the input size. This means that the algorithm takes an extremely long time to execute for larger input sizes, and is often impractical for large inputs.

For example, consider the following algorithm that generates all possible subsets of an array:

```java
public void generateSubsets(int[] arr, int[] subset, int i) {
    if (i == arr.length) {
        print(subset);
        return;
    }
    subset[i] = -1;
    generateSubsets(arr, subset, i+1);
    subset[i] = arr[i];
    generateSubsets(arr, subset, i+1);
}

```

The number of operations performed by this algorithm is a power of two in the size of the input array. Specifically, the algorithm generates all possible subsets of the array, which takes 2^n operations. Therefore, the time complexity of this algorithm is O(2^n), where n is the size of the input array.

In conclusion, understanding the common time complexities and their corresponding Big O notation is an important aspect of analyzing and comparing the efficiency of algorithms. It is important to note that the Big O notation provides an upper bound on the time complexity, and the actual time complexity may be different in practice. Choosing the right algorithm for a specific problem and being aware of the trade-offs between time and space complexity are crucial steps in optimizing the performance of a program.

## Best case, worst case, and average case time complexity

So far, we have seen how to express the time complexity of an algorithm using the Big O notation. However, in many cases, the time complexity of an algorithm can vary depending on the specific input. In this lecture, we will take a closer look at the best case, worst case, and average case time complexity of an algorithm.

### Best case time complexity

The best case time complexity of an algorithm is the scenario where the algorithm performs the least number of operations. This typically occurs when the input is already sorted or when the algorithm is able to find the desired output quickly. For example, consider the following algorithm that uses a binary search to find a specific element in a sorted array:

```java
public int binarySearch(int[] arr, int x) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] < x) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return -1;
}
```

In the best case scenario, the desired element is located at the middle of the array, so the algorithm only needs to perform one comparison. Therefore, the best case time complexity of this algorithm is O(1).

### Worst case time complexity

The worst case time complexity of an algorithm is the scenario where the algorithm performs the most number of operations. This typically occurs when the input is not random but sorted or otherwise arranged in a way that makes the worst possible starting point for the algorithm. For example, consider the following algorithm that sorts an array using the bubble sort algorithm:

```java
public void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}
```

In the worst case scenario, the array is already sorted in reverse order. Therefore, the algorithm needs to perform n(n-1)/2 comparisons. Therefore, the worst case time complexity of this algorithm is O(n^2).

### Average case time complexity

The average case time complexity of an algorithm is the scenario where the algorithm performs an average number of operations. This typically occurs when the input is a random set of data.

:::note
Determining the best case, worst case and average case time complexity of an algorithm can be difficult as it depends on the specific inputs and the implementation of the algorithm. However, these complexities can give an idea of how the algorithm behaves on different types of inputs, and can be useful when choosing the right algorithm for a specific problem or when comparing the performance of different algorithms.
:::

In conclusion, when analyzing the time complexity of an algorithm, it's important to consider not just the upper bound provided by the Big O notation, but also the specific scenarios of best case, worst case, and average case time complexity. These complexities give a more complete picture of the performance of an algorithm, and can help to make more informed decisions about which algorithm to use for a specific problem.

## Space Complexity

In addition to the time complexity, it's also important to consider the amount of memory or space an algorithm requires. This is known as the space complexity of an algorithm.

The space complexity of an algorithm is the amount of memory used by the algorithm in relation to the size of the input. The space complexity is typically expressed using the same Big O notation as time complexity.

For example, consider the following algorithm that calculates the nth Fibonacci number using recursion:

```java
public int fib(int n) {
    if (n <= 1) {
        return n;
    }
    return fib(n-1) + fib(n-2);
}
```

The space complexity of this algorithm is O(n) because the maximum depth of recursion is n. At any given point in time, the algorithm uses about 2n units of memory (because of the two `fib` calls) to store the function calls on the stack.

It is important to note that, in some cases, the space complexity of an algorithm can be more difficult to determine than the time complexity, as it depends on the specific implementation and data structures used. However, when designing an algorithm, it's important to consider both time and space complexity to ensure that the algorithm is efficient and practical.

In conclusion, space complexity is an important aspect of algorithm analysis and design, even though it isn't often as important as time complexity. It measures the amount of memory used by an algorithm in relation to the size of the input. Understanding the space complexity of an algorithm can help to make more informed decisions about which algorithm to use for a specific problem and can help to optimize the performance of a program.

## Trade-offs between time and space complexity

In many cases, there is a trade-off between time and space complexity, where improving one aspect of the algorithm can have a negative impact on the other aspect.

One example of a trade-off between time and space complexity is the use of recursion versus iteration. Recursive algorithms often have a simpler implementation, but they consume additional memory due to the use of the call stack. On the other hand, iterative algorithms use less memory, but they can be more complex to implement for certain problems that are more conducive to the recursive approach.

Another example of this trade-off is the use of dynamic programming versus greedy algorithms. Dynamic programming algorithms often have a better time complexity but require more memory to store intermediate results, while greedy algorithms have a simpler implementation and use less memory but may not always produce the optimal solution.

It's important to consider both time and space complexity when choosing the right algorithm for a specific problem and when optimizing the performance of a program. However, it's also important to consider other factors such as ease of implementation, readability, and maintainability when making these decisions.
