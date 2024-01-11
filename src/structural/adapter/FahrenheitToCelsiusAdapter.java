package structural.adapter;
// Adapter
public class FahrenheitToCelsiusAdapter implements TemperatureInCelsius{
    private TemperatureInFahrenheit temperatureInFahrenheit;

    public FahrenheitToCelsiusAdapter(TemperatureInFahrenheit temperatureInFahrenheit) {
        this.temperatureInFahrenheit = temperatureInFahrenheit;
    }

    @Override
    public double getTemperature() {
        // Lógica de conversão de Fahrenheit para Celsius
        return (temperatureInFahrenheit.getTemperatureInFahrenheit() - 32) * 5 / 9;
    }
}
