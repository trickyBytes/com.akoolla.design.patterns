package com.akoolla.designpatterns.structural.composite;

/**
 * Component.
 * 
 * @author tiffir
 * @version $Id$
 */
public interface Component {
    /**
     * Carries out the required operation on the component.
     */
    void operation();

    /**
     * Adds the given component to the the composite.
     * 
     * @param component {@link Component} to add
     */
    void addComponent(Component component);

    /**
     * Removes the given component from the composite.
     * 
     * @param component {@link Component} to remove
     */
    void removeComponent(Component component);

    /**
     * Returns the parent component, returns null if not parent.
     * 
     * @return {@link Component} parent component
     */
    Component getParent();

    /**
     * Sets the parent component of the object.
     * 
     * @param comnponent parent {@link Component}
     */
    void setParent(Component comnponent);
}
