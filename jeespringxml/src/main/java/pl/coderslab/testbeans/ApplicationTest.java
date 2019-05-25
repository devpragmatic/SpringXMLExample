package pl.coderslab.testbeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("pl.coderslab")
public class ApplicationTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationTest.class);
        TestBean bean = context.getBean(TestBean.class);
    }
}
