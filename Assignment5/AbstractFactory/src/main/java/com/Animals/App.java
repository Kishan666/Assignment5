package com.Animals;
import com.Animals.Animal;
/**
 * Created by Kishan on 2017-04-02.
 */
public class App {
    public static void main(String[] args)
    {
        AbstractFactory abstractFactory = new AbstractFactory();

        SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory("reptile");
        Animal a1 = speciesFactory1.getAnimal("tyrannosaurus");
        System.out.println("Tyrannosaurus sound: "+a1.makeSound());
        Animal a2 = speciesFactory1.getAnimal("snake");
        System.out.println("Snake sound: "+a2.makeSound());

        SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory("mammal");
        Animal a3 = speciesFactory2.getAnimal("dog");
        System.out.println("Dog sound: "+a3.makeSound());
        Animal a4 = speciesFactory2.getAnimal("cat");
        System.out.println("Cat sound: "+a4.makeSound());
        }
    }

