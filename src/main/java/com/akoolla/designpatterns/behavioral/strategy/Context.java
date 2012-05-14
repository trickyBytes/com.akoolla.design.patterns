package com.akoolla.designpatterns.behavioral.strategy;

/**
 * <p><b>Context</b> or <b>Composition</b></p> <p> <ul> <li>Is configured with a ConcreteStrategy object</li>
 * <li>Maintains a reference to a Strategy object</li> <li>May define an interface that lets Strategy access it's
 * data</li></ul>.
 * 
 * @author tiffir
 * @version $Id$
 */
public class Context {
    private final Strategy strategy;

    // Constructor
    /**
     * Sets the {@link Strategy} to use in the context.
     * 
     * @param strategy {@link Strategy#} that will be used in {@link Context#executeStrategy(int, int)} method.
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Executes a {@link Strategy}.
     * 
     * @param a int
     * @param b int
     * @return result of {@link Strategy}
     */
    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}
