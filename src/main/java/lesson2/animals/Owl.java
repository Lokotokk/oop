package lesson2.animals;

import lesson2.RunSpeed;
import lesson2.animals.base.Bird;

public class Owl extends Bird implements FlySpeed, RunSpeed {

    public Owl(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Ux";
    }

    @Override
    public String feed() {
        return "mouse";
    }

    @Override
    public int getRunSpeed() {
        return 2;
    }

    @Override
    public int getFlySpeed() {
        return 90;
    }

    @Override
    public String toString() {
        return String.format("Owl: %s, Speed: %d, Fly: %d", super.toString(), getRunSpeed(), getFlySpeed());
    }
}
