package hmLesson2.fishes;

import hmLesson2.aquarium.SwimSpeed;
import hmLesson2.fishes.base.Herbivores;

public class Carp extends Herbivores implements SwimSpeed {
    public Carp(String name) {
        super(name);
    }

    @Override
    public String livingЕnvironment() {
        return "lake";
    }

    @Override
    public String toString() {
        return String.format("Carp: %s, livingЕnvironment: %s, speed: %d", super.toString(), livingЕnvironment(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed() {
        return 20;
    }
}
