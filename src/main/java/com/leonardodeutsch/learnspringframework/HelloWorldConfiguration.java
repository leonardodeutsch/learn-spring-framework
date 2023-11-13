package com.leonardodeutsch.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Location location) {};
record Location (String city, String state) {};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Leo";
    }

    @Bean
    public int age() {
        return 20;
    }

    @Bean
    public Person person() {
        return new Person("Leo", 21, new Location("Houston", "TX"));
    }

    @Bean(name = "location2")
    public Location location() {
        return new Location("Spring", "TX");
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), location());
    }

    @Bean
    public Person person3Parameters(String name, int age, Location location2) {
        return new Person(name, age, location2);
    }

}
