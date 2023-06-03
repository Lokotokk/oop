package lesson2;

import lesson2.animals.*;
import lesson2.animals.base.Animal;
import lesson2.zoo.Zoo;

public class Main {
    public static void main(String[] args) {
//        1. Реализовать абстрактный класс Animal и его наследники Cat, Dog, и прочее.
//           Родитель имеет в себе общие данные (пример: кличка, количествор лап, какие звуки издают и тд),
//           а наследники собственные параметры (тип перемещения). Можно сделать дополнительную абстракцию,
//           хищники и травоядные.

//        2. Создать класс Zoo, и организовать перекличку животных.
//           Теперь создать объект радио, и подумать, как его включить в объект Zoo.

        Animal bear = new Bear("Потапыч");
        Animal cow = new Cow("Мурка");

        Zoo zoo = new Zoo();
        zoo.addAnimal(bear).addAnimal(cow).addAnimal(new Duck("Donald")).addAnimal(new Owl("Sava"));
        System.out.println(zoo);

        System.out.println(zoo.getSound());

        System.out.println("Чемпион по бегу: ");
        RunSpeed champ = zoo.getRunnerChampion();
        System.out.println(champ);

        System.out.println("Бегуны: ");
        for (RunSpeed runner:zoo.runners()) {
            System.out.println(runner);
        }

        System.out.println("Чемпион среди летающих: ");
        System.out.println(zoo.getFlyerChampion());

        System.out.println("Летающие животные: ");
        for (FlySpeed flyers: zoo.flyers()) {
            System.out.println(flyers);
        }

        System.out.println("Чемпион по плаванию: ");
        System.out.println(zoo.getSwimmerChampion());

        System.out.println("Плавающие животные: ");
        for (SwimSpeed swimmers: zoo.swimmers()) {
            System.out.println(swimmers);
        }
    }
}
