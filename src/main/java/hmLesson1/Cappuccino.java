package hmLesson1;

public class Cappuccino extends Drink {
    String type;
    boolean isChocoCrumb;


    public Cappuccino(String name, double volume, double temperature, int sugar, double price, String type, boolean isChocoCrumb) {
        super(name, volume, temperature, sugar, price);
        this.type = type;
        this.isChocoCrumb = isChocoCrumb;
    }

    @Override
    public String toString() {
        return String.format("%s, Тип: %s, Шоколадная крошка:%s", super.toString(), type, isChocoCrumb);
    }
}
