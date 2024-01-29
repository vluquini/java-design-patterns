package behavioral.templatemethod;

public class MeatLoversPizza extends Pizza{
    @Override
    void prepareDough() {
        System.out.println("Preparing thin crust dough");
    }

    @Override
    void addIngredients() {
        System.out.println("Adding meat: pepperoni, sausage, bacon");
    }

    @Override
    void bakePizza() {
        System.out.println("Baking at 220 degrees Celsius for 15 minutes");
    }
}
