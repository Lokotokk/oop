package hmLesson2.fishes;

import hmLesson2.aquarium.SwimSpeed;
import hmLesson2.fishes.base.Herbivores;

public class ParrotFish extends Herbivores implements SwimSpeed {
    public ParrotFish(String name) {
        super(name);
    }

    @Override
    public String livingЕnvironment() {
        return "river";
    }

    @Override
    public String toString() {
        return String.format("ParrotFish: %s, livingЕnvironment: %s, speed: %d", super.toString(), livingЕnvironment(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed() {
        return 45;
    }
}
