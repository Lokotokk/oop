package lesson2.animals.base;

import lesson2.zoo.Soundable;

public abstract class Animal implements Soundable {

    protected String name; // будет виден в пределах пакета lesson2, в пределах всех классов-наследников класса Animal.

    public Animal(String name) {
        this.name = name;
    }

    public abstract String sound();
    public abstract String feed();

    @Override
    public String toString() {
        return String.format("Name: %s, food: %s", name, feed());
    }
}
