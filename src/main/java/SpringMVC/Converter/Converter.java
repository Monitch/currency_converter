package SpringMVC.Converter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Converter {
    public Converter() {
        parse();
    }

    double USD;
    double EUR;
    double RUB;
    String[] mass = new String[3];


    private void parse() {
        new Thread(() -> {
            Document doc = null;
            try {
                doc = Jsoup.connect("https://finance.ua/ua/currency").get();
            } catch (IOException e) {
                e.printStackTrace();
            }
            assert doc != null;
            Elements title = doc.select(".c3");
            int i = 0;
            for (Element titles : title) {
                if (i < 3) {
                    System.out.println(titles.text());
                    mass[i] = titles.text();
                    i++;
                }
            }
            USD = Double.parseDouble(mass[0]);
            EUR = Double.parseDouble(mass[1]);
            RUB = Double.parseDouble(mass[2]);
        }).start();
    }

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
