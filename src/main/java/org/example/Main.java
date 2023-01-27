package org.example;


import org.example.calculator.Sequence;
import org.example.builder.FibonacciBuilder;
import org.example.builder.SequenceBuilder;


public class Main {
    public static boolean CACHE_IS_ENABLED = false;

    public static void main(String[] args) {
        SequenceBuilder fibonacciBuilder = new FibonacciBuilder();

        Sequence fibonacci = fibonacciBuilder.getInstance();

        System.out.println(fibonacci.getNumber(50));
    }
}