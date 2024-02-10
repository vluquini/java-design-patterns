package structural.bridge;

public abstract class Form {
    private Color color;

    public Form(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    abstract void myFormAndColor();
}
