package SpringMVC.Controller;

import SpringMVC.Converter.Converter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CurrencyController {
    @RequestMapping()
    public String index(Model model) {
        return "index";
    }

    @PostMapping()
    public String getValue(@RequestParam("value") String value,
                           @RequestParam("toCurrency") String toCurrency,
                           @RequestParam("fromCurrency")  String fromCurrency,
                           Model model) {
        Converter converter = new Converter();
        value = String.valueOf(converter.convert(Integer.parseInt(value), fromCurrency, toCurrency));
        model.addAttribute("value", value);
        return "index";
    }
}
