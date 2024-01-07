package creational.factorymethod.ex2;

public class DigitalMedia extends Game{
    public DigitalMedia(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice(double price) {
        return price *= 1.5;
    }
}
