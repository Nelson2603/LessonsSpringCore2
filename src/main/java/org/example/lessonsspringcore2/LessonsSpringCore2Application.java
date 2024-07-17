package org.example.lessonsspringcore2;

import org.example.lessonsspringcore2.model.Auto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class LessonsSpringCore2Application {

    public static void main(String[] args) {
        //Create container and output object
        var context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Auto auto1 = context.getBean("auto1", Auto.class);
        Auto auto2 = context.getBean("auto2", Auto.class);
        Auto auto3 = context.getBean("auto3", Auto.class);
        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);
    }
}
