package behavioral.templatemethod;

public class VeggiePizza extends Pizza{

    @Override
    void prepareDough() {
        System.out.println("Preparing whole wheat dough");
    }

    @Override
    void addIngredients() {
        System.out.println("Adding veggies: capsicum, tomato, onion");
    }

    @Override
    void bakePizza() {
        System.out.println("Baking at 200 degrees Celsius for 20 minutes");
    }

    @Override
    boolean customerWantsExtraCheese() {
        return true;
    }
}
