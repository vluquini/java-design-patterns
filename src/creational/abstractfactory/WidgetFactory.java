package creational.abstractfactory;

public interface WidgetFactory {
    ScrollBar CreateScrollBar(String nome);
    Window CreateWindow(String nome);
}
