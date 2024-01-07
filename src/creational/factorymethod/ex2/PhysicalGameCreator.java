package creational.factorymethod.ex2;

public class PhysicalGameCreator implements GameCreator{
    @Override
    public Game createGame(String name, double price) {
        return new PhysicalMedia(name, price);
    }
}
