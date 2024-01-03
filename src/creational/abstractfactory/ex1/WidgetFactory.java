package creational.abstractfactory.ex1;

public interface WidgetFactory {
    ScrollBar CreateScrollBar(String nome);
    Window CreateWindow(String nome);
}
