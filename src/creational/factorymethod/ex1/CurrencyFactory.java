package creational.factorymethod.ex1;

public class CurrencyFactory {
    public static Currency newCurrency(Country country) {
        return switch (country) {
            case USA    -> new UsDollar();
            case BRAZIL -> new Real();
            case JAPAN  -> new Yen();
            case CHINA  -> new Yuan();
            default -> throw new IllegalArgumentException("Not currency found for this country");
        };
    }
}






