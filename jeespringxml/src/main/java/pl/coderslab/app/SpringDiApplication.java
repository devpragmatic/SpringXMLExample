package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.MessageSender;
import pl.coderslab.beans.MessageService;

public class SpringDiApplication {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
            String message = helloWorld.getMessage();
            System.out.println(message);
            //Zadanie 3
            MessageService messageService = context.getBean("messageService", MessageService.class);
            messageService.send("Test");
            //Zadanie 4
            MessageSender messageSender = context.getBean("messageSender", MessageSender.class);
            messageSender.sendMessage();
            //Zadanie 5
            messageSender.sendMessageFromProperty();
        }
    }
}