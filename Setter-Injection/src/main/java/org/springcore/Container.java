package org.springcore;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Container {
    public static void main(String[] args) {
        ConfigurableApplicationContext context= new AnnotationConfigApplicationContext(myConfig.class);
        Movie movie= (Movie)context.getBean("movie");
        System.out.println("Movie Name :" + movie.getMovie_name());
        System.out.println("Actor Name :" + movie.getActor());
        System.out.println("Rating :" + movie.getRating());
    }
}
