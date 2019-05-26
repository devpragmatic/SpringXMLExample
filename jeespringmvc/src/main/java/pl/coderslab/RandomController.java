package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RandomController {

    @RequestMapping(path = "/showRandom", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String showRandom(){
        return "Wylosowano liczbę: " + (int) Math.ceil(Math.random() * 100);
    }
}
