package hmLesson1;

public class Latte extends Drink {
    String syrup;
    boolean isCinnamon;


    public Latte(String name, double volume, double temperature, int sugar, double price, String syrup, boolean isCinnamon) {
        super(name, volume, temperature, sugar, price);
        this.syrup = syrup;
        this.isCinnamon = isCinnamon;
    }

    @Override
    public String toString() {
        return String.format("%s, Сироп: %s, Корица:%s", super.toString(), syrup, isCinnamon);
    }
}

