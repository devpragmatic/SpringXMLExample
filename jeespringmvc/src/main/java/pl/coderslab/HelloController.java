package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @GetMapping("/helloView")
    public String helloView(Model model){
        model.addAttribute("color", "white");
        model.addAttribute("backgroundColor", "black");
        return "home";
    }

    @GetMapping("/helloView2")
    public String helloView2(Model model){
        model.addAttribute("color", "black");
        model.addAttribute("backgroundColor", "white");
        return "home";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld(HttpServletRequest request){
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        return "Hello World " + name + surname;
    }

    @RequestMapping("/hello/{firstName}/{lastName}")
    @ResponseBody
    public String hello(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName){
        return String.format("Witaj %s %s",firstName, lastName);
    }

    @RequestMapping("/helloRequestParam/{saySomething}")
    @ResponseBody
    private String helloRequest(@PathVariable String saySomething,
                                @RequestParam String name,
                                @RequestParam(defaultValue = "Nowak") String surname,
                                @RequestParam(required = false) Long id
    ) {
        return "Hello World " + name + surname + " " + saySomething;
    }
}
