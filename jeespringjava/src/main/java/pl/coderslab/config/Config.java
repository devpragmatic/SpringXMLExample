package pl.coderslab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.coderslab.beans.HelloWorld;

@Configuration
public class Config {

    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}
