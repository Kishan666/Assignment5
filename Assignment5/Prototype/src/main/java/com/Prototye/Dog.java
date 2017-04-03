/**
 * Created by Kishan on 2017-04-02.
 */

package com.Prototye;

public class Dog implements Prototype {

	String sound;

	public Dog(String sound) {
		this.sound = sound;
	}

	@Override
	public Prototype doClone() {
		return new Dog(sound);
	}

	public String toString() {
		return "This dog says " + sound;
	}
}
