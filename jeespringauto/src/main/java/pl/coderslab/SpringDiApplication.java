package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.PersonService;
import pl.coderslab.config.Config;

public class SpringDiApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        PersonService person = ctx.getBean(PersonService.class);
        System.out.println(person.getPersonRepo().getClass().getName());
    }
}
