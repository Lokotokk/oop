package hmLesson2.fishes.base;

import hmLesson2.aquarium.SwimSpeed;

public abstract class Fish implements SwimSpeed {

    protected String name;

    public Fish(String name) {
        this.name = name;
    }

    public abstract String feed();
    public abstract String livingЕnvironment();

    @Override
    public String toString() {
        return String.format("Name: %s, food: %s", name, feed());
    }
}
