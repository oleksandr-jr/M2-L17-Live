package org.example.builder;

import org.example.cache.FibonacciProxy;
import org.example.calculator.FibonacciCalculator;
import org.example.calculator.Sequence;
import org.example.Main;

public class FibonacciBuilder implements SequenceBuilder{
    @Override
    public Sequence getInstance() {
        Sequence fibonacci = new FibonacciCalculator();

        if (Main.CACHE_IS_ENABLED){
            fibonacci = new FibonacciProxy(fibonacci);
        }

        return fibonacci;
    }
}
