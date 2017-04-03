package com.Singleton.Domain;
import com.Singleton.Domain.ShapeType;
/**
 * Created by Kishan on 2017-04-02.
 */
public class Triangle implements ShapeType {
    private String shapeType;
    private int numSides = 3;
    private String colour = "Blue";
    public void setShapeType(String shapeType){this.shapeType = shapeType;}
    public String shapeType(){return "Triangle";}
    public int getNumSides(){return numSides; }
    public void setNumSides(int numSides){this.numSides = numSides;}
    public String getColour(){return colour; }
    public void setColour(String colour){this.colour = colour;}
   @Override
    public String toString() {return "Shape info "+"\nNumber of Sides: "+numSides+"\nColour: "+colour;
    }
}
