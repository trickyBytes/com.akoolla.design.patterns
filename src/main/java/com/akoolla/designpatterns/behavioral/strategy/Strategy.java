package com.akoolla.designpatterns.behavioral.strategy;

/**
 * Strategy or Compositor declares an interface common to all supported algorithms. Context uses this interface to call
 * the algorithm defined by a ConcreteStrategy..
 * 
 * @author tiffir
 * @version $Id$
 */
public interface Strategy {
    /**
     * Executes a behaviour, given the two values.
     * 
     * @param a int
     * @param b int
     * @return result of behaviour
     */
    int execute(int a, int b);
}
