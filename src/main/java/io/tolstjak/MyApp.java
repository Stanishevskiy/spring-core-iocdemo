package io.tolstjak;

import io.tolstjak.domain.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        var myClass = new MyApp();
        myClass.invokeCoachWork();

    }

    public void invokeCoachWork() {

        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("currentCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
    }
}
