package creational.prototype.ex2;

public class Client {
    public static void main(String[] args) {
        Product p1 = new Product("Produto A", 100.0);

        Product p2 = p1.clone(p1);
        p2.setName("Produto B");

        System.out.println(p1.getName());
        System.out.println(p2.getName());

//        System.out.println(p1.equals(p2));
//        System.out.println(p1.hashCode());
//        System.out.println(p2.hashCode());

    }
}
