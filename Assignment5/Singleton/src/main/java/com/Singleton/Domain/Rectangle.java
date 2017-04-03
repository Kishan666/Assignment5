package com.Singleton.Domain;

/**
 * Created by Kishan on 2017-04-02.
 */
public class Rectangle implements ShapeType {
    private String shapeType;
    private int numSides = 4;
    private String colour = "Red";
    public void setShapeType(String shapeType){this.shapeType = shapeType;}
    public String shapeType(){return "Triangle";}
    public int getNumSides(){return numSides; }
    public void setNumSides(int numSides){this.numSides = numSides;}
    public String getColour(){return colour; }
    public void setColour(String colour){this.colour = colour;}
    @Override
    public String toString() {return "Shape Info "+"\nNumber of Sides: "+numSides+"\nColour: "+colour;}
}
