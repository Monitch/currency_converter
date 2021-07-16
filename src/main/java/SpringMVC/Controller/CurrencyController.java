package SpringMVC.Controller;

import SpringMVC.Converter.Converter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.DecimalFormat;

@Controller
public class CurrencyController {
    @RequestMapping()
    public String index() {
        return "index";
    }

    @PostMapping()
    public String getValue(@RequestParam("value") double value,
                           @RequestParam("toCurrency") String toCurrency,
                           @RequestParam("fromCurrency") String fromCurrency,
                           Model model) {
        Converter converter = new Converter();
        DecimalFormat dF = new DecimalFormat("#.##");
        double startedValue = value;

        value = converter.convert(value, fromCurrency, toCurrency);

        model.addAttribute("value", startedValue+" " +fromCurrency + " = " + dF.format(value) + " " +toCurrency);
        return "index";
    }
}
