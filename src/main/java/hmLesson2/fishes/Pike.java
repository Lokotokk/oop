package hmLesson2.fishes;

import hmLesson2.aquarium.SwimSpeed;
import hmLesson2.fishes.base.Predator;

public class Pike extends Predator implements SwimSpeed {
    public Pike(String name) {
        super(name);
    }

    @Override
    public String livingЕnvironment() {
        return "river";
    }

    public String toString() {
        return String.format("Pike: %s, livingЕnvironment: %s, speed: %d", super.toString(), livingЕnvironment(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed() {
        return 10;
    }
}
