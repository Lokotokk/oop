package hmLesson2.fishes.base;

import hmLesson2.fishes.base.Fish;

public abstract class Herbivores extends Fish {
    public Herbivores(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "водоросли";
    }
}
