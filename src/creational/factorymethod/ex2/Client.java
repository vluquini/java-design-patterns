package creational.factorymethod.ex2;
/*
Neste modelo também há o uso do padrão Strategy, por meio da classe
abstrata Game e o método "calculatePrice", que é implementado
de maneira diferente pelas subclasses "DigitalMedia" e "PhysicalMedia".
 */
public class Client {
    public static void main(String[] args) {
        GameCreator gm1 = new DigitalGameCreator();
        GameCreator gm2 = new PhysicalGameCreator();

        Game g1 = gm1.createGame("God of War", 250.0);
        Game g2 = gm2.createGame("Far Cry", 350.0);

        System.out.println(g1.toString() + g1.getClass());
        System.out.println(g2.toString() + g2.getClass());
    }
}
