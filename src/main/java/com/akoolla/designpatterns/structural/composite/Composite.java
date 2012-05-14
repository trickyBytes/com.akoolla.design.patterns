package com.akoolla.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite.
 * 
 * @author tiffir
 * @version $Id$
 */
public class Composite implements Component {

    private Component parent;

    private final List<Component> childComponents = new ArrayList<Component>();

    /**
     * @see com.akoolla.designpatterns.structural.composite.Component#operation()
     */
    public void operation() {
        for (Component component : childComponents) {
            component.operation();
        }
    }

    /**
     * Adds component to composite.
     * 
     * @param component {@link Component} to add to composite
     */
    public void addComponent(Component component) {
        component.setParent(this);
        childComponents.add(component);
    }

    /**
     * Removes component from composite.
     * 
     * @param component {@link Component} to remove from composite
     */
    public void removeComponent(Component component) {
        childComponents.remove(component);
    }

    /**
     * @return {@link Component} parent
     * @see com.akoolla.designpatterns.structural.composite.Component#getParent()
     */
    public Component getParent() {
        return parent;
    }

    /**
     * Set the parent.
     * 
     * @param parent the parent
     */
    public void setParent(Component parent) {
        this.parent = parent;
    }
}
