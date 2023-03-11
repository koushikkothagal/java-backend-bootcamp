package io.javabrains.functionaljava;

public class LambdaExamples {

    public static void main(String[] args) {

        MathOperation increment = x -> x + 1;
        int result = increment.operation(10);
        System.out.println("result = " + result);

        AnotherOperation newLambda = num -> num * 2 + 124;
        System.out.println(newLambda.operation(20));

        // newLambda = increment; // Will not work
        System.out.println(newLambda.operation(20));



    }
}

interface MathOperation {
    int operation(int x);
}

interface AnotherOperation {
    int operation(int x);
}

