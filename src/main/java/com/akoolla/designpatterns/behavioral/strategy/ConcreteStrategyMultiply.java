package com.akoolla.designpatterns.behavioral.strategy;

/**
 * ConcreteStrategyMultiply, concrete implementation of a {@link Strategy} that multiplies two supplied numbers.
 * 
 * @author tiffir
 * @version $Id$
 */
public class ConcreteStrategyMultiply implements Strategy {

    /**
     * @param a value to multiply by b
     * @param b value to multiply a by
     * @return a multiplied by b
     * @see com.akoolla.designpatterns.behavioral.strategy.Strategy#execute(int, int)
     */
    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategyMultiply's execute()");
        return a * b; // Do a multiplication with a and b
    }

}
