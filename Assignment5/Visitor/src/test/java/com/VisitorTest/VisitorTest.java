package com.VisitorTest;


import com.Shape.*;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kishan on 2017-04-03.
 */
public class VisitorTest {
    @Before
    public void setup() {

    }

    @Test
    public void testVisitorShape() throws Exception {
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
        Assert.assertEquals(shapeList.add(sq1),true);


    }
    @Test
    public void testNotNull() throws Exception {
        ShapeVisitor perimeterVisitor = new PerimeterVisitor();
        Assert.assertNotNull(perimeterVisitor);
    }
}
