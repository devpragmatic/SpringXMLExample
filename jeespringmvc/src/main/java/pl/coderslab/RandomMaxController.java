package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RandomMaxController {

    @RequestMapping(path = "/random/{min}/{max}", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String random(@PathVariable("min") long min, @PathVariable("max") long max){
        long random = (long) Math.ceil(Math.random() * (max - min)) + min;
        return String.format("Użytkownik podał wartość %d i %d. Wylosowano liczbę: %d", min, max, random);
    }
}
