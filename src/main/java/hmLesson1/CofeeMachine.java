package hmLesson1;

import java.util.*;

public class CofeeMachine {

    private List<Drink> machine = new ArrayList<>();

    private double cash;

    public List<Drink> getCofeeMachine() {
        return machine;
    }

    public double getCash() {
        return cash;
    }

    public CofeeMachine addDrink(Drink drink) {
        machine.add(drink);
        return this;
    }

    public Drink findDrink(String name) {
        for (Drink drink: machine) {
            if (name.equals(drink.getName())) {
                return drink;
            }
        }
        return null;
    }

    public Drink saleDrink(String name) {
        Drink slDrink = findDrink(name);
        if (slDrink != null) {
            cash = cash + slDrink.getPrice();
            machine.remove(slDrink);
        }
        return slDrink;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Остаток денег в кофейном автомате: ").append(cash).append("\n");
        for (Drink drink:machine) {
            sb.append(drink).append("\n");
        }
        return sb.toString();
    }
}
