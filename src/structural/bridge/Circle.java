package structural.bridge;

public class Circle extends Form{

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void myFormAndColor() {
        System.out.println("My form is a Circle and my color is " + this.getColor());
    }
}
