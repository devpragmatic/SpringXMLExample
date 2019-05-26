package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Controller
public class FreeTimeController {

    @GetMapping(path = "/freeTime", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String doAction() {
        LocalDateTime now = LocalDateTime.now();
        return informAboutStatus(now);
    }

    @GetMapping(path = "/free", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String free() {
        LocalDateTime now = LocalDateTime.of(2019, 05, 26, 18, 0);
        return informAboutStatus(now);
    }

    @GetMapping(path = "/inWork", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String inWork() {
        //Powinno byc pracuje nie dzwon
        LocalDateTime now = LocalDateTime.of(2019, 05, 22, 10, 0);
        return informAboutStatus (now);
    }

    @GetMapping(path = "/afterWork", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String afterWork() {
        //Powinno byc po pracy
        LocalDateTime now = LocalDateTime.of(2019, 05, 22, 18, 0);
        return informAboutStatus(now);
    }

    private String informAboutStatus(LocalDateTime now) {
        DayOfWeek currentDateOfWeek = now.getDayOfWeek();
        List<DayOfWeek> freeDays = Arrays.asList(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);
        if (freeDays.contains(currentDateOfWeek)) {
            return "Wolne";
        }
        int hour = now.getHour();
        if (hour >= 9 && hour <= 17) {
            return "Pracuje, nie dzwoń";
        }
        return "Po Pracy";
    }
}
