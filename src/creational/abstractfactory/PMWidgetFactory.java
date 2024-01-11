package creational.abstractfactory;

public class PMWidgetFactory implements WidgetFactory{
    @Override
    public Window CreateWindow(String nome) {
        return new PMWindow(nome);
    }

    @Override
    public ScrollBar CreateScrollBar(String nome) {
        return new PMScrollBar(nome);
    }

}
