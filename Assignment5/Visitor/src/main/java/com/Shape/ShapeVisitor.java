package com.Shape;

import java.util.List;

/**
 * Created by Kishan on 2017-04-03.
 */
public interface ShapeVisitor {
    public void visit(Triangle triangle);

    public void visit(Square square);

    public void visit(List<Shape> shapeList);
}
