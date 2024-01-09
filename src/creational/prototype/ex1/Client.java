package creational.prototype.ex1;

public class Client {
    public static void main(String[] args) {
        Product p1 = new Product("Produto A", 100.0);
        Product p2 = p1.clone();

        p2.setNome("Produto B");

        System.out.println(p1.getNome());
        System.out.println(p2.getNome());

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
