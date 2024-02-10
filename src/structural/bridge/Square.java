package structural.bridge;

public class Square extends Form{


    public Square(Color color) {
        super(color);
    }

    @Override
    public void myFormAndColor() {
        System.out.println("My form is a Square and my color is " + this.getColor());
    }
}
