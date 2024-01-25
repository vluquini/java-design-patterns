package structural.flyweight.ex2;

public class Client {
    public static void main(String[] args) {
    // Aqui é instanciado as poções (superior e inferior da 'prateleira') por meio da Factory
        var alchemistShop = new AlchemistShop();
    // Pelo método "drinkPotions" percorremos toda a lista de poções (superiores e inferiores)
        alchemistShop.drinkPotions();
    }
}
