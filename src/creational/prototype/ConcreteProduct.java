package creational.prototype;

public class ConcreteProduct implements Prototype{

    @Override
    public Product clone(Product product) {
        return new Product(product.getName(), product.getPrice());
    }
}
