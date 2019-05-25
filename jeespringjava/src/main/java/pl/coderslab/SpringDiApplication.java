package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.ScopePrototype;
import pl.coderslab.beans.ScopeSingleton;
import pl.coderslab.beans.Ship;
import pl.coderslab.config.Config;

public class SpringDiApplication {

    public static void main(String[] args) {
        //Zadanie 2
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        HelloWorld helloWorld = ctx.getBean("helloWorld", HelloWorld.class);
        helloWorld.hello();
        //Zadanie 3
        Ship ship = ctx.getBean("blackPearl", Ship.class);
        ship.getCaptain().startSailing();
        //Zadanie 4
        ScopeSingleton singleton1 = ctx.getBean(ScopeSingleton.class);
        System.out.println(singleton1);
        ScopeSingleton singleton2 = ctx.getBean(ScopeSingleton.class);
        System.out.println(singleton2);
        System.out.println((singleton1 == singleton2) + ": ten sam obiekt\n");
        ScopePrototype prototype1 = ctx.getBean(ScopePrototype.class);
        System.out.println(prototype1);
        ScopePrototype prototype2 = ctx.getBean(ScopePrototype.class);
        System.out.println(prototype2);
        System.out.println((prototype1 == prototype2) + ": dwa różne obiekty");

        ctx.close();
    }
}
