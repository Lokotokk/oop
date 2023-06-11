package lesson4.warriors;

import lesson4.shields.Shield;
import lesson4.weapons.Weapon;

import java.util.Random;

public abstract class Warrior<W extends Weapon, S extends Shield> {
    private String name;
    private int healthPoint;
    private W weapon;

    private S shield;

    public Warrior(String name, int healthPoint, W weapon, S shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public W getWeapon() {
        return weapon;
    }
    public S getShield() {
        return shield;
    }

    public void setShield(S shield) {
        this.shield = shield;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public int hit() {
        Random rnd = new Random();
        return rnd.nextInt(0, weapon.damage() + 1);
    }

    public void rediceHealth(int damage) {
        healthPoint -= damage;
        if (healthPoint < 0) {
            healthPoint = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Name:%s, Weapon:%s, HealthPoint:%d", name, weapon, healthPoint);
    }
}
