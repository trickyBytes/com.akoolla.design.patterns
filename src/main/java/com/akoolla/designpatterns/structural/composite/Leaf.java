package com.akoolla.designpatterns.structural.composite;

/**
 * Leaf.
 * 
 * @author tiffir
 * @version $Id$
 */
public class Leaf implements Component {

    private Component parent;

    /**
     * @see {@linkplain Component#operation()}
     */
    public void operation() {
        System.out.println("Leaf");
    }

    /**
     * @return parent {@link Component}
     * @see {@linkplain Component#getParent()}
     */
    public Component getParent() {
        return parent;
    }

    /**
     * @param comnponent set parent {@link Component}
     * @see {@linkplain Component#setParent(Component)}
     */
    public void setParent(Component comnponent) {
        parent = comnponent;
    }

    /**
     * @param component not added
     */
    public void addComponent(Component component) {
        throw new UnsupportedOperationException();
    }

    /**
     * @param component not removed
     */
    public void removeComponent(Component component) {
        throw new UnsupportedOperationException();
    }
}
