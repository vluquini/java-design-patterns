package creational.factorymethod.ex2;

public class DigitalGameCreator implements GameCreator{
    @Override
    public Game createGame(String name, double price) {
        return new DigitalMedia(name, price);
    }
}
