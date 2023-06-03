package hmLesson2;

import hmLesson2.aquarium.Aquarium;
import hmLesson2.fishes.Carp;
import hmLesson2.fishes.ParrotFish;
import hmLesson2.fishes.Pike;
import hmLesson2.fishes.WhiteShark;
import hmLesson2.fishes.base.Fish;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Написать аквариум, или террариум по аналогии с зоопарком.
//        Добавить интерфейс - скорость плавания

        Aquarium aquarium = new Aquarium();
        aquarium.addFish(new WhiteShark("Winter")).addFish(new Pike("Gosha"))
                .addFish(new Carp("Tom"))
                .addFish(new ParrotFish("Kesha"));
        System.out.println(aquarium);
        System.out.println("Быстрее всех: ");
        System.out.println(aquarium.getSwimmerChampion());
    }
}
