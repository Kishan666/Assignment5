package com.Animals;

/**
 * Created by Kishan on 2017-04-02.
 */
import com.Animals.Animal;
import com.Animals.Cat;
import com.Animals.Dog;
public class MammalFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type)
    {
        if("dog".equals(type))
        {
            return new Dog();
        }
        else
        {
            return new Cat();
        }
    }
}
