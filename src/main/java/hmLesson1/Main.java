package hmLesson1;

public class Main {
    public static void main(String[] args) {
//        Создать торговый кофейный автомат,
//        Напитки в автомате должны содержать следующие данные:
//        наименование, объем, температура, цена.
//        Проинициализировать несколько напитков в классе main и торговый автомат,
//        Воспроизвести логику продажи напитков.
//        Сделать согласно принципам ООП, пройденным на семинаре.

//        1. СofeeMachine: List cofeeMachine, cash;
//        2. Drink: name, volume, temperature, price, int sugar(0, 1, 2);
//        3. Latte: String syrup(сироп), boolean cinnamon(корица)
//        4. Cappuccino: String type(ванильный, обычный, карамельный), boolean chocolateСrumb;


        CofeeMachine cofeeApparat = new CofeeMachine();
        cofeeApparat.addDrink(new Drink("Americano", 0.2, 95, 1, 130))
                .addDrink(new Drink("Black tea", 0.3, 85, 2, 60))
                .addDrink(new Latte("Latte macchiato", 0.2, 75, 1, 210, "caramel", true))
                .addDrink(new Cappuccino("Cappuccino", 0.3,70,2,180,"vanilla", false));

        System.out.println(cofeeApparat);

        System.out.println("------продажа------");
        Drink userDrink = cofeeApparat.saleDrink("Americano");
        Drink userDrink2 = cofeeApparat.saleDrink("Latte macchiato");
        System.out.println(userDrink);
        System.out.println(userDrink2);
        System.out.println("-------------------");
        System.out.println(cofeeApparat);
    }
}
