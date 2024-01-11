package structural.adapter;
// Adaptee
public class TemperatureInFahrenheit {
    private double temperature;

    public TemperatureInFahrenheit(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperatureInFahrenheit() {
        return temperature;
    }
}
