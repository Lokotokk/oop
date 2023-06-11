package lesson4.shields;

public class Light implements Shield{
    @Override
    public int damageReduction() {
        return 2;
    }

    @Override
    public String toString() {
        return String.format("Light: %d", damageReduction());
    }
}
