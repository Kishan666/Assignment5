package com.Singleton;

/**
 * Created by Kishan on 2017-04-02.
 */
import com.Singleton.Domain.ShapeType;
import com.Singleton.Domain.Rectangle;
import com.Singleton.Domain.Triangle;
public class SingletonShape {
    private static SingletonShape singletonShape = null;

    public SingletonShape() {

    }

    public static SingletonShape getSingletonShapeInstance() {
        if (singletonShape == null) {
            return new SingletonShape();
        }
        return singletonShape;
    }

    public ShapeType getShapeType(String shapeType) {
        if (shapeType.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        }
        else
        {
            return new Rectangle();
        }
        }
    }

