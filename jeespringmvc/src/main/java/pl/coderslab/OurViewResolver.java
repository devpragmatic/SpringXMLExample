package pl.coderslab;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//@Component
public class OurViewResolver extends InternalResourceViewResolver {

    public OurViewResolver() {
        super();
        setPrefix("/WEB-INF/views/");
        setSuffix(".jsp");
    }
}
