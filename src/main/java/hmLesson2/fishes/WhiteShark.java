package hmLesson2.fishes;

import hmLesson2.aquarium.SwimSpeed;
import hmLesson2.fishes.base.Predator;

public class WhiteShark extends Predator implements SwimSpeed {
    public WhiteShark(String name) {
        super(name);
    }

    @Override
    public String livingЕnvironment() {
        return "sea";
    }

    @Override
    public String toString() {
        return String.format("WhiteShark: %s, livingЕnvironment: %s, speed: %d", super.toString(), livingЕnvironment(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed() {
        return 15;
    }
}
