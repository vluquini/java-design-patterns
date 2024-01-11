package creational.abstractfactory;

public abstract class ScrollBar {
    String nomeScrollBar;

    public ScrollBar(String nomeScrollBar) {
        this.nomeScrollBar = nomeScrollBar;
    }

    public String getNomeScrollBar() {
        return nomeScrollBar;
    }

}
