package pl.coderslab.multiplay;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MultiplyController {

    @GetMapping("/multiply")
    public String multiply(HttpServletRequest request, @RequestParam(value = "size", defaultValue = "10") int size){
        request.setAttribute("rows", size);
        request.setAttribute("cols", size);
        return "multiply";
    }

    @GetMapping("/paramMultiply/{rows}/{cols}")
    public String paramMultiply(HttpServletRequest request,
                                @PathVariable(value = "rows") int rows,
                                @PathVariable(value = "cols") int cols
                                ){
        request.setAttribute("rows", rows);
        request.setAttribute("cols", cols);
        return "multiply";
    }
}
