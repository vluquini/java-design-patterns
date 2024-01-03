package creational.abstractfactory.ex1;

public class Client {
    public static void main(String[] args) {
        // Criando objetos do tipo Motif
        WidgetFactory motifFactory1 = new MotifWidgetFactory();

        Window motifWindow1 = motifFactory1.CreateWindow("MotifWindow1");
        ScrollBar motifScrollBar1 = motifFactory1.CreateScrollBar("MotifScrollBar1");

        System.out.println(motifWindow1.getNomeWindow());
        System.out.println(motifScrollBar1.getNomeScrollBar());

        System.out.println("======================================");
        // Criando objetos do tipo PM
        WidgetFactory pmFactory1 = new PMWidgetFactory();

        Window pmWindow1 = pmFactory1.CreateWindow("PMWindow1");
        ScrollBar pmScrollBar1 = pmFactory1.CreateScrollBar("PMScrollBar1");

        System.out.println(pmWindow1.getNomeWindow());
        System.out.println(pmScrollBar1.getNomeScrollBar());
    }
}
