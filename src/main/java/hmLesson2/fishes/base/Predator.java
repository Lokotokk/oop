package hmLesson2.fishes.base;

import hmLesson2.fishes.base.Fish;

public abstract class Predator extends Fish {
    public Predator(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "мелкая рыба, птицы";
    }
}
