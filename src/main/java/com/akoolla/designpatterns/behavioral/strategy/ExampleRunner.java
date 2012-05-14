package com.akoolla.designpatterns.behavioral.strategy;

/**
 * ExampleRunner.
 * 
 * @author tiffir
 * @version $Id$
 */
public final class ExampleRunner {

    /**
     * 
     */
    private ExampleRunner() {
    }

    /**
     * @param args {@link String} array of arguments, none used
     */
    public static void main(String[] args) {
        Context context;
        final int num1 = 3;
        final int num2 = 4;

        // Three contexts following different strategies
        context = new Context(new ConcreteStrategyAdd());
        int resultA = context.executeStrategy(num1, num2);
        System.out.println("Result = " + resultA);

        context = new Context(new ConcreteStrategySubtract());
        int resultB = context.executeStrategy(num1, num2);
        System.out.println("Result = " + resultB);

        context = new Context(new ConcreteStrategyMultiply());
        int resultC = context.executeStrategy(num1, num2);
        System.out.println("Result = " + resultC);
    }
}
