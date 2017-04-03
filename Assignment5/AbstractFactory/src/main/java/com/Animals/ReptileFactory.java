package com.Animals;

/**
 * Created by Kishan on 2017-04-02.
 */
import com.Animals.Animal;
import com.Animals.Snake;
import com.Animals.Tyrannosaurus;
public class ReptileFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type) {
        if ("snake".equals(type)) {
            return new Snake();
        } else {
            return new Tyrannosaurus();

        }

    }
}