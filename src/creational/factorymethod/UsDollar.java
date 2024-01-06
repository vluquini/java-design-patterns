package creational.factorymethod;

public class UsDollar implements Currency{
    @Override
    public String getSymbol() {
        return "U$";
    }
}
