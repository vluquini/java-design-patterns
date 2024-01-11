package creational.abstractfactory;

public class MotifWidgetFactory implements WidgetFactory{
    @Override
    public Window CreateWindow(String nome) {
        return new MotifWindow(nome);
    }

    @Override
    public ScrollBar CreateScrollBar(String nome) {
        return new MotifScrollBar(nome);
    }

}
