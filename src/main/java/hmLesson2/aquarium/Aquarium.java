package hmLesson2.aquarium;

import hmLesson2.fishes.base.Fish;
import lesson2.RunSpeed;
import lesson2.animals.base.Animal;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<Fish> aquarium = new ArrayList<>();

    public Aquarium addFish(Fish newFish) {
        aquarium.add(newFish);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("В аквариуме: \n");
        for (Fish fish : aquarium) {
            builder.append(fish)
                    .append("\n");
        }
        return builder.toString();
    }

    public SwimSpeed getSwimmerChampion() {
        SwimSpeed champ = aquarium.get(0);
        for (Fish fish : aquarium) {
            if (champ.getSwimSpeed() < fish.getSwimSpeed()) {
                champ = fish;
            }
        }
        return champ;
    }
}
