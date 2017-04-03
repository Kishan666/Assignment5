package com.Singleton;

import com.Singleton.Domain.Rectangle;
import com.Singleton.Domain.ShapeType;
import com.Singleton.Domain.Triangle;

import java.util.Scanner;

/**
 * Created by Kishan on 2017-04-02.
 */
public class App  {
    public static void main (String[] args)
    {
        String t="Triangle";
        String r = "Triangle";
        SingletonShape singletonShape = SingletonShape.getSingletonShapeInstance();
        System.out.println("Enter shape");
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        if(t.equalsIgnoreCase(i))
        {
        System.out.println( singletonShape.getShapeType("Triangle").toString());
        }
        else if(r.equalsIgnoreCase(i))
        {
            System.out.println(singletonShape.getShapeType("Triangle").toString());
        }
        else
        {
            System.out.println("Invalid Shape");

        }
    }

}
