package com.Shape;

/**
 * Created by Kishan on 2017-04-03.
 */
public class Triangle implements Shape {
    int side1;
    int side2;
    int side3;


    public Triangle(int side1,int side2,int side3 )
    {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    @Override
    public void accept(ShapeVisitor visitor)
    {
        visitor.visit(this);
    }
}
