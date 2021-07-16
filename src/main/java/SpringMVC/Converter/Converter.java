package SpringMVC.Converter;

public class Converter {

    double USD = 27.21;
    double EUR = 32.13;
    double RUB = 0.37;

    public double convert(double value, String fromCurrency, String toCurrency) {
        value = convertToUAH(value, fromCurrency);
        value = convertToCurrency(value, toCurrency);
        return value;
    }

    private double convertToUAH(double value, String Currency) {
        switch (Currency) {
            case "USD" -> value = value * USD;
            case "EUR" -> value = value * EUR;
            case "RUB" -> value = value * RUB;
        }
        return value;
    }

    private double convertToCurrency(double value, String Currency) {
        switch (Currency) {
            case "USD" -> value = value / USD;
            case "EUR" -> value = value / EUR;
            case "RUB" -> value = value / RUB;
        }
        return value;
    }
}
