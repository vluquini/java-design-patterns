package creational.factorymethod;

public class Client {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.JAPAN);

        System.out.println(currency.getSymbol());
    }
}
