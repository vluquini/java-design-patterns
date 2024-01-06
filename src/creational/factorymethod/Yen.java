package creational.factorymethod;

public class Yen implements Currency{
    @Override
    public String getSymbol() {
        return "JPY";
    }
}
