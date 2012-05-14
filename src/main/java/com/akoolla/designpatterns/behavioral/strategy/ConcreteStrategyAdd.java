package com.akoolla.designpatterns.behavioral.strategy;

/**
 * ConcreteStrategyAdd, concrete implementation of a {@link Strategy} that adds two supplied numbers.
 * 
 * @author tiffir
 * @version $Id$
 */
public class ConcreteStrategyAdd implements Strategy {

    /**
     * @param a int to add value b too
     * @param b value to add to a
     * @return b added to a
     * @see com.akoolla.designpatterns.behavioral.strategy.Strategy#execute(int, int)
     */
    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategyAdd's execute()");
        return a + b; // Do an addition with a and b
    }

}
