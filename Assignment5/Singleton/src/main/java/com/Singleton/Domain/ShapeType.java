package com.Singleton.Domain;

/**
 * Created by Kishan on 2017-04-02.
 */
public interface ShapeType {
    public abstract String shapeType();
    public abstract int getNumSides();
    public abstract void setNumSides(int numSides );
    public abstract void setColour(String colour );
    public abstract String getColour();
    public abstract String toString();

}
