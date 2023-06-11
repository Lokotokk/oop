package lesson4.shields;

public class Heavy implements Shield{
    @Override
    public int damageReduction() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("Heavy: %d", damageReduction());
    }
}
