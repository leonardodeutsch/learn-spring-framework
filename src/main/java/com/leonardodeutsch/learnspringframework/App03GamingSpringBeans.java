package com.leonardodeutsch.learnspringframework;

import com.leonardodeutsch.learnspringframework.game.GamingConsole;
import com.leonardodeutsch.learnspringframework.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);

        context.getBean(GamingConsole.class).up();

        context.getBean(GameRunner.class).run();
    }
}
