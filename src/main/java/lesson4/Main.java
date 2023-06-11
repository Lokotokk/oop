package lesson4;

import lesson4.shields.Heavy;
import lesson4.shields.Light;
import lesson4.warriors.Archer;
import lesson4.warriors.Infantryman;
import lesson4.warriors.Warrior;
import lesson4.weapons.meleeWeapon.Axe;
import lesson4.weapons.meleeWeapon.Sword;
import lesson4.weapons.rangedWeapon.Bow;
import lesson4.weapons.rangedWeapon.CrossBow;

public class Main {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>();
        team1.add(new Archer("Robin", 100, new Bow(), new Light()));
        team1.add(new Infantryman("John", 150, new Axe(), new Heavy()));

        Team<Archer> teamArchers = new Team<>();
        teamArchers.add(new Archer("Jimmy", 100, new CrossBow(), new Light()));
        teamArchers.add(new Archer("Piter",100, new Bow(), new Light()));

        Team<Infantryman> infantrymanTeam = new Team<>();
        infantrymanTeam.add(new Infantryman("James", 150, new Sword(), new Heavy()));

        System.out.println("---team1---");
        System.out.println(team1);
        System.out.println("---teamArchers---");
        System.out.println(teamArchers);
        System.out.println("---infantrymanTeam---");
        System.out.println(infantrymanTeam);

        System.out.println("---battle---");
        Infantryman w1 = new Infantryman("John", 150, new Axe(), new Heavy());
        Archer w2 = new Archer("Robin", 100, new Bow(), new Light());
        Battle battle1 = new Battle(w1, w2);
        battle1.fight();
    }
}
