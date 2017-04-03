package com.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kishan on 2017-04-03.
 */
public class App {
    public static void main(String[] args) {

        Square sq1 = new Square(2,2,2,2);
        Square sq2 = new Square(3,3,3,3);
        Triangle tri = new Triangle(4, 4, 4);

        List<Shape> shapeList = new ArrayList<Shape>();
        shapeList.add(sq1);
        shapeList.add(sq2);
        shapeList.add(tri);

        System.out.println("Perimeter of Shapes:");
        ShapeVisitor perimeterVisitor = new PerimeterVisitor();
        perimeterVisitor.visit(shapeList);



    }
}
