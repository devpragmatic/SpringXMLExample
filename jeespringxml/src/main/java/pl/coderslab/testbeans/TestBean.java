package pl.coderslab.testbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.coderslab.beans.MessageSender;

import java.util.Optional;

@Component
public class TestBean {

    private MessageSender messageSender;

    @Autowired
    public TestBean(Optional<MessageSender> myServiceA) {
        System.out.println("Test2");
        myServiceA.ifPresent(messageSender1 -> {
            messageSender = messageSender1;
            System.out.println("test3");
        });
    }
}
