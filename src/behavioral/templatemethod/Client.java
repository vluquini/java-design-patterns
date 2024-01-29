package behavioral.templatemethod;

// Template Method
public class Client {
    public static void main(String[] args) {
        System.out.println("Making a Veggie Pizza:");
        Pizza veggiePizza = new VeggiePizza();
        veggiePizza.makePizza();

        System.out.println("\nMaking a Meat Lovers Pizza:");
        Pizza meatLoversPizza = new MeatLoversPizza();
        meatLoversPizza.makePizza();
    }
}
