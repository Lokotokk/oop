package hmLesson1;

public class Drink {
    String name;
    double volume;
    double temperature;
    int sugar;
    double price;

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getSugar() {
        return sugar;
    }

    public double getPrice() {
        return price;
    }

    public Drink(String name, double volume, double temperature, int sugar, double price) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
        this.sugar = sugar;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Напиток: %s, Объём: %f, Температура: %f, Сахар(ложек): %d, Цена: %f", name, volume, temperature, sugar, price);
    }
}
