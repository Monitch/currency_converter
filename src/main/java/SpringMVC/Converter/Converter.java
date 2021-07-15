package SpringMVC.Converter;

public class Converter {
    //FUTURE
    int USD = 1;
    int EUR = 2;
    int RUB = 3;
    int UAH = 27;


    public int convert(int value, String fromCurrency, String toCurrency){
        switch (toCurrency) {
            case "usd":
                value = value * USD;
                break;
            case "eur":
                value = value * EUR;
                break;
            case "rub":
                value = value * RUB;
                break;
            case "uah":
                value = value * UAH;
                break;
        }
        return value;
    }
}
