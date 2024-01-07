package creational.factorymethod.ex2;

public class PhysicalMedia extends Game{
    public PhysicalMedia(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice(double price) {
        return price * 1.8;
    }
}
