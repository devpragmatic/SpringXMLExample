package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Controller
public class SessionController {

    @GetMapping("/session")
    @ResponseBody
    public String session(HttpSession httpSession){
        Object loginStart = httpSession.getAttribute("loginStart");
        System.out.println(loginStart);
        if(loginStart != null){
            return loginStart.toString();
        }
        return LocalDateTime.now().toString();
    }
}
