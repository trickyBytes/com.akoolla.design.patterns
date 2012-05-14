package com.akoolla.designpatterns.behavioral.strategy;

/**
 * ConcreteStrategySubtract, concrete implementation of a {@link Strategy} that sub-tracts two supplied numbers.
 * 
 * @author tiffir
 * @version $Id$
 */
public class ConcreteStrategySubtract implements Strategy {

    /**
     * @param a value to subtract b from
     * @param b vale to subtract from a
     * @return int a - b
     * @see com.akoolla.designpatterns.behavioral.strategy.Strategy#execute(int, int)
     */
    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategySubtract's execute()");
        return a - b; // Do a subtraction with a and b
    }
}
