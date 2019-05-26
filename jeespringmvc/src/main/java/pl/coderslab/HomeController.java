package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping({"/witam"})
    @ResponseBody
    public String hello() {
        return "index.jsp";
    }

    @RequestMapping(path = "/", produces = "text/html; charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public String start(Model model) {
        return "<h1>title</h1> <p>  łóąś</p>";
    }

    @RequestMapping(path = "/json", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String json(Model model) {
        return "{'name'='gdzie jest json'}";
    }
}