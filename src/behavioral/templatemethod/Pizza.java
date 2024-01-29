package behavioral.templatemethod;

public abstract class Pizza {
    // Método template
    public final void makePizza() {
        prepareDough();
        addIngredients();
        bakePizza();
        if (customerWantsExtraCheese()) {
            addExtraCheese();
        }
    }

    // Métodos abstratos a serem implementados pelas subclasses
    abstract void prepareDough();

    abstract void addIngredients();

    abstract void bakePizza();

    // Método hook opcional
    boolean customerWantsExtraCheese() {
        return false;
    }

    // Método concreto
    void addExtraCheese() {
        System.out.println("Adding extra cheese");
    }
}
