package creational.prototype;

public class Client {
    public static void main(String[] args) {
        Product p1 = new Product("Produto A", 100.0);
        ConcreteProduct c1 = new ConcreteProduct();

        Product p2 = c1.clone(p1);
        p2.setName("Produto B");

        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }
}
