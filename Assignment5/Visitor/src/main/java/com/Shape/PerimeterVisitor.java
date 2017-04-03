package com.Shape;

import java.util.List;

/**
 * Created by Kishan on 2017-04-03.
 */
public class PerimeterVisitor implements ShapeVisitor {
    @Override
    public void visit(Square square) {
        int sqPerimeter = square.side1 + square.side2+square.side3+square.side4;
        System.out.println("Square " + sqPerimeter+"cm");
    }

    @Override
    public void visit(Triangle triangle) {
        int trPerimeter = triangle.side1+triangle.side2+triangle.side3;
        System.out.println("Triangle "+trPerimeter+"cm");
    }

    @Override
    public void visit(List<Shape> shapeList) {
        for (Shape sh : shapeList) {
            sh.accept(this);
        }
    }
}
