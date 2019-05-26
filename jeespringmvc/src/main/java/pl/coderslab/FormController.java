package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/first")
public class FormController {

    @GetMapping("/form")
    public String get(Model model) {
        model.addAttribute("data", LocalDateTime.now().toString());
        return "formView";
//        return "/WEB-INF/views/formView.jsp";
    }

    @PostMapping("/form")
    public String post(@RequestParam("first_name") String firstName,
                       HttpServletRequest httpServletRequest) {
        httpServletRequest.setAttribute("first_name", firstName);
        return "formView";
    }
}
