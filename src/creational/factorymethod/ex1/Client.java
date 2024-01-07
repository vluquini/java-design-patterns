package creational.factorymethod.ex1;
/*
Esta á a aplicação do Factory usando métodos Statics.
Comumente utilizado em diversas classes Java, como Calendar, Math,
Stream, Integer, etc.
 */
public class Client {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.JAPAN);

        System.out.println(currency.getSymbol());
    }
}
