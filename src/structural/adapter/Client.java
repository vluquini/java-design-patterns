package structural.adapter;

public class Client {
    public static void main(String[] args) {
        // Medindo a temperatura em graus Fahrenheit
        TemperatureInFahrenheit temperatureInFahrenheit = new TemperatureInFahrenheit(98.6);
        System.out.println("Temperatura em graus Fahrenheit: " + temperatureInFahrenheit.getTemperatureInFahrenheit());

        // Adaptando a temperatura para graus Celsius
        TemperatureInCelsius adapter = new FahrenheitToCelsiusAdapter(temperatureInFahrenheit);

        // Usando a temperatura em graus Celsius
        System.out.println("Temperatura em graus Celsius: " + adapter.getTemperature());

    }
}
