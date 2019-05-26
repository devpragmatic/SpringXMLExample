package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld(HttpServletRequest request){
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        return "Hello World " + name + surname;
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
