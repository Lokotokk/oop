package lesson4.warriors;

import lesson4.shields.Heavy;
import lesson4.weapons.Weapon;
import lesson4.weapons.meleeWeapon.Melee;

public class Infantryman extends Warrior<Melee, Heavy> {
    public Infantryman(String name, int healthPoint, Melee weapon, Heavy shield) {
        super(name, healthPoint, weapon, shield);
    }

    @Override
    public String toString() {
        return String.format("Infantryman:%s", super.toString());
    }
}
