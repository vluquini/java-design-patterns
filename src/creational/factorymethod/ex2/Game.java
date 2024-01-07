package creational.factorymethod.ex2;

public abstract class Game {
    private String name;
    private double price;

    public Game(String name, double price) {
        this.name = name;
        this.price = calculatePrice(price);
    }

    public abstract double calculatePrice(double price);

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
