package creational.abstractfactory;

public abstract class Window {
    private String nomeWindow;

    public Window(String nomeWindow) {
        this.nomeWindow = nomeWindow;
    }

    public String getNomeWindow() {
        return nomeWindow;
    }
}
