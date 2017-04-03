package com.Shape;

/**
 * Created by Kishan on 2017-04-03.
 */
public class Square implements Shape {
    int side1;
    int side2;
    int side3;
    int side4;


    public Square(int side1,int side2,int side3, int side4 )
    {
       this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        this.side4=side4;
    }

    @Override
    public void accept(ShapeVisitor visitor)
    {
        visitor.visit(this);
    }

}
