package com.akoolla.designpatterns.structural.composite;

/**
 * ExampleRunner.
 * 
 * @author tiffir
 * @version $Id$
 */
public final class ExampleRunner {

    private ExampleRunner() {
        super();
    }

    /**
     * Simple method to construct and run composite pattern.
     * 
     * @param args no args used
     */
    public static void main(String[] args) {
        // Initialise some leaves
        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();
        Component leaf3 = new Leaf();
        Component leaf4 = new Leaf();

        // Initialise 2 composites
        Composite composite = new Composite();
        Composite composite2 = new Composite();
        Composite composite3 = new Composite();

        // Add some leaf objects to composite (branch)
        composite2.addComponent(leaf1);
        composite2.addComponent(leaf2);

        // Add some leaf object to composite (branch)
        composite3.addComponent(leaf3);
        composite3.addComponent(leaf4);

        // Add branches to another branch
        composite.addComponent(composite2);
        composite.addComponent(composite3);

        // Call operation on top node
        composite.operation();
    }
}
