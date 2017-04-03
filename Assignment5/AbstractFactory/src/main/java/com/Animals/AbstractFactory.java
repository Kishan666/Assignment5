package com.Animals;

/**
 * Created by Kishan on 2017-04-02.
 */
public class AbstractFactory {
    public SpeciesFactory getSpeciesFactory(String type)
    {
        if("mammal".equals(type))
        {
            return new MammalFactory();
        }
        else
        {
            return new ReptileFactory();
        }
    }
}
