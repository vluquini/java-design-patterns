package structural.bridge;

public class Client {
    public static void main(String[] args) {
        Form c1 = new Circle(Color.BLACK);
        Form s1 = new Square(Color.YELLOW);

        c1.myFormAndColor();
        s1.myFormAndColor();
    }
}
