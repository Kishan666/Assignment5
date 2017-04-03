package com.Animals;

/**
 * Created by Kishan on 2017-04-02.
 */
import com.Animals.Animal;
public abstract class SpeciesFactory {
    public abstract Animal getAnimal(String type);

}
